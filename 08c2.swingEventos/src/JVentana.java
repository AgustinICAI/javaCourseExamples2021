import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class JVentana extends JFrame implements ActionListener, WindowListener, KeyListener
{
    JButton jbtnEnviar;
    JButton jbtnBorrar;
    JTextField jtxtNombre;
    MyCanvas myCanvas;

    HashMap<String,Point> personas = new HashMap<>();

    public static void main(String argv[])
    {
        new JVentana();
        System.out.println("Después de la creación de la ventana");
    }
    public JVentana()
    {
        super("Formulario ICAI");
        //POR DEFECTO EL LAYOUT DE UN JFRAME ES UN BORDERLAYOUT
        JPanel pnlSouth = new JPanel();
        pnlSouth.setBackground(Color.YELLOW);
        this.add(pnlSouth,BorderLayout.SOUTH);
        jbtnEnviar = new JButton("ENVIAR");
        jbtnBorrar = new JButton("BORRAR");

        jbtnEnviar.addActionListener(this);
        jbtnBorrar.addActionListener(this);
        //this.add(jbtn1,BorderLayout.SOUTH);
        pnlSouth.add(jbtnEnviar);
        pnlSouth.add(jbtnBorrar);

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
        Image im = new ImageIcon("3847862-200.png").getImage();
        ImageIcon ii = new ImageIcon(im.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH));
        JLabel jlb1 = new JLabel("Nombre",ii,SwingConstants.CENTER);
        Font font = new Font("Arial",Font.BOLD,30);
        jlb1.setFont(new Font("Arial",Font.BOLD,30));
        JLabel jlb2 = new JLabel("Apellido1");
        jlb2.setFont(font);
        JLabel jlb3 = new JLabel("Apellido2");
        jlb3.setFont(font);


        myCanvas = new MyCanvas(this);
        this.add(myCanvas,BorderLayout.NORTH);


        jtxtNombre = new JTextField();
        JTextField jtxtApellido1 = new JTextField();
        JTextField jtxtApellido2 = new JTextField();
        //EL LAYOUT POR DEFECTO DE UN PANEL ES UN FLOWLAYOUT
        pnlCenter.setLayout(new GridLayout(3,2));
        pnlCenter.add(jlb1);
        pnlCenter.add(jtxtNombre);
        pnlCenter.add(jlb2);
        pnlCenter.add(jtxtApellido1);
        pnlCenter.add(jlb3);
        pnlCenter.add(jtxtApellido2);

        //this.setSize(500,500);
        this.pack();
        this.setResizable(false);
        //this.setLocation(300,300);
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(this);

        jtxtNombre.addKeyListener(this);

        this.setVisible(true);
        /*
        personas.add("Pepe");
        personas.add("Paco");
        personas.add("Juan");

         */
        myCanvas.repaint();
    }
    public HashMap<String,Point> getPersonas() {
        return personas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jbtnEnviar) {
            this.enviar();
        }
        else if (e.getSource() == this.jbtnBorrar) {
            this.personas.clear();
            myCanvas.repaint();
        }

    }

    private void enviar() {
        System.out.println("Botón enviar");
        this.personas.put(jtxtNombre.getText(),new Point((int)(Math.random()*myCanvas.getWidth()),(int)(Math.random()*myCanvas.getHeight())));
        this.myCanvas.repaint();
        jtxtNombre.setText("");
        jtxtNombre.requestFocus();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.enviar();
        }

    }
}