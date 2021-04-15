import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;

class MyCanvas extends JPanel {
    private JVentana jVentana;
    Image fondo;
    Persona nombre = null;
    Point distanciaPunto = null;

    Font f = new Font("Arial", Font.BOLD, 30);

    MyCanvas(JVentana jVentana) {
        super();
        this.setPreferredSize(new Dimension(300, 300));
        this.jVentana = jVentana;
        fondo = Toolkit.getDefaultToolkit().getImage("46888871-624a3900-ce7f-11e8-808e-99fd90c8a3f4.png");
        fondo = fondo.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (nombre != null) {
                    //jVentana.getPersonas().get(nombre).setLocation(e.getPoint());
                    //Nueva implementación para corregir el desvío inicial
                    nombre.setPosicion(new Point((int)(e.getPoint().getX()-distanciaPunto.getX()),(int)(e.getPoint().getY()+distanciaPunto.getY())));
                    MyCanvas.this.repaint();
                }
            }
        });


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                for (Persona p : jVentana.getPersonas()) {
                    int anchoTexto = MyCanvas.this.getFontMetrics(f).stringWidth(p.getNombre());
                    if (e.getX() > p.getPosicion().getX() && e.getX() < p.getPosicion().getX()  + anchoTexto
                        && e.getY() > p.getPosicion().getY()-f.getSize() && e.getY() < p.getPosicion().getY()+f.getSize())
                    {
                        nombre = p;
                        //Calculando diferencia de distancia en el click por duda de Alumno
                        distanciaPunto = new Point((int)(e.getX()-p.getPosicion().getX()),(int)(p.getPosicion().getY()-e.getY()));

                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                nombre = null;
            }
        });


        Timer t1 = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (Persona p : jVentana.getPersonas())
                {
                    p.actualizaPosicion(MyCanvas.this.getSize());
                }
                MyCanvas.this.repaint();
            }
        });
        t1.start();


    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, this);
        g.setFont(f);
        for (Persona p : this.jVentana.getPersonas()) {
            g.setColor(Color.BLACK);
            g.drawString(p.getNombre(), (int) p.getPosicion().getX(), (int) p.getPosicion().getY());
            //Pinto el area clickeable
            g.setColor(Color.RED);
            int anchoTexto = MyCanvas.this.getFontMetrics(f).stringWidth(p.getNombre());
            g.drawRect((int) p.getPosicion().getX(), (int) p.getPosicion().getY()-f.getSize(), anchoTexto, f.getSize());

        }


    }


}