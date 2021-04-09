import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;

class MyCanvas extends Canvas {
    private JVentana jVentana;
    Image fondo;
    String nombre = null;
    Point distanciaPunto = null;

    Font f = new Font("Arial", Font.BOLD, 30);

    MyCanvas(JVentana jVentana) {
        super();
        this.setSize(300, 300);
        this.jVentana = jVentana;
        fondo = Toolkit.getDefaultToolkit().getImage("46888871-624a3900-ce7f-11e8-808e-99fd90c8a3f4.png");
        fondo = fondo.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (nombre != null) {
                    //jVentana.getPersonas().get(nombre).setLocation(e.getPoint());
                    //Nueva implementación para corregir el desvío inicial
                    jVentana.getPersonas().get(nombre).setLocation(new Point((int)(e.getPoint().getX()-distanciaPunto.getX()),(int)(e.getPoint().getY()+distanciaPunto.getY())));
                    MyCanvas.this.repaint();
                }
            }
        });


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                for (Map.Entry<String, Point> p : jVentana.getPersonas().entrySet()) {
                    int anchoTexto = MyCanvas.this.getFontMetrics(f).stringWidth(p.getKey());
                    if (e.getX() > p.getValue().getX() && e.getX() < p.getValue().getX()  + anchoTexto
                        && e.getY() > p.getValue().getY()-f.getSize() && e.getY() < p.getValue().getY()+f.getSize())
                    {
                        nombre = p.getKey();

                        //Calculando diferencia de distancia en el click por duda de Alumno
                        distanciaPunto = new Point((int)(e.getX()-p.getValue().getX()),(int)(p.getValue().getY()-e.getY()));

                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                nombre = null;
            }
        });
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(fondo, 0, 0, this);
        g.setFont(f);
        for (Map.Entry<String, Point> p : this.jVentana.getPersonas().entrySet()) {
            g.setColor(Color.BLACK);
            g.drawString(p.getKey(), (int) p.getValue().getX(), (int) p.getValue().getY());
            //Pinto el area clickeable
            g.setColor(Color.RED);
            int anchoTexto = MyCanvas.this.getFontMetrics(f).stringWidth(p.getKey());
            g.drawRect((int) p.getValue().getX(), (int) p.getValue().getY()-f.getSize(), anchoTexto, f.getSize());

        }


    }


}