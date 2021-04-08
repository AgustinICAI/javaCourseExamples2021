import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;

class MyCanvas extends Canvas implements MouseListener
{
    private JVentana jVentana;
    Image fondo;
    MyCanvas(JVentana jVentana)
    {
        super();
        this.setSize(300,300);
        this.jVentana = jVentana;
        fondo = Toolkit.getDefaultToolkit().getImage("46888871-624a3900-ce7f-11e8-808e-99fd90c8a3f4.png");
        fondo = fondo.getScaledInstance(500,300,java.awt.Image.SCALE_SMOOTH);

        this.addMouseListener(this);

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(fondo,0,0,this);
        g.setFont(new Font("Arial",Font.BOLD,30));

        for(Map.Entry<String,Point> persona: this.jVentana.getPersonas().entrySet())
        {
            g.setColor(Color.BLACK);
            g.drawString(persona.getKey(),(int)persona.getValue().getX(),(int)persona.getValue().getY());
            //Pinto el area clickeable
            g.setColor(Color.RED);
            g.drawRect((int)persona.getValue().getX()-20,(int)persona.getValue().getY()-20,40,40);
        }



    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (Map.Entry<String,Point> p : this.jVentana.getPersonas().entrySet()) {
            if (p.getValue().getX() > e.getX() - 20 && p.getValue().getX() < e.getX() + 20
                    && p.getValue().getY() > e.getY() - 20 && p.getValue().getY() < e.getY() + 20)
                System.out.println(p.getKey());
        }

        e.getX();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}