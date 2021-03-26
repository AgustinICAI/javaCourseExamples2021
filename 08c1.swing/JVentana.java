import javax.swing.*;
import java.awt.*;

public class JVentana extends JFrame
{
    public static void main(String argv[])
    {
        new JVentana();
    }
    public JVentana()
    {
        super("Formulario ICAI");
        //POR DEFECTO EL LAYOUT DE UN JFRAME ES UN BORDERLAYOUT
        JPanel pnlSouth = new JPanel();
        pnlSouth.setBackground(Color.YELLOW);
        this.add(pnlSouth,BorderLayout.SOUTH);
        JButton jbtn1 = new JButton("ENVIAR");
        //this.add(jbtn1,BorderLayout.SOUTH);
        pnlSouth.add(jbtn1);

        JPanel pnlNorth = new JPanel();
        pnlNorth.setBackground(new Color(187, 9, 9));
        this.add(pnlNorth,BorderLayout.NORTH);

        JPanel pnlWest = new JPanel();
        pnlWest.setBackground(Color.BLUE);
        this.add(pnlWest,BorderLayout.WEST);

        JPanel pnlEast = new JPanel();
        pnlEast.setBackground(Color.GREEN);
        this.add(pnlEast,BorderLayout.EAST);

        JPanel pnlCenter = new JPanel();
        this.add(pnlCenter,BorderLayout.CENTER);
        JLabel jlb1 = new JLabel("Nombre");
        JLabel jlb2 = new JLabel("Apellido1");
        JLabel jlb3 = new JLabel("Apellido2");
        JTextField jtxt1 = new JTextField();
        JTextField jtxt2 = new JTextField();
        JTextField jtxt3 = new JTextField();
        //EL LAYOUT POR DEFECTO DE UN PANEL ES UN FLOWLAYOUT
        pnlCenter.setLayout(new GridLayout(3,2));
        pnlCenter.add(jlb1);
        pnlCenter.add(jtxt1);
        pnlCenter.add(jlb2);
        pnlCenter.add(jtxt2);
        pnlCenter.add(jlb3);
        pnlCenter.add(jtxt3);

        //this.setSize(500,500);
        this.pack();
        //this.setResizable(false);
        //this.setLocation(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}