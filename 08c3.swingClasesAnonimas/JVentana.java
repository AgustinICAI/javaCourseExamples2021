import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class JVentana extends JFrame
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

        jbtnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviar();
            }
        });
        jbtnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personas.clear();
                myCanvas.repaint();
            }
        });
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
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JVentana.this.dispose();
                System.exit(0);
            }
        });

        jtxtNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enviar();
                }
            }
        });

        this.setVisible(true);
        myCanvas.repaint();
    }
    public HashMap<String,Point> getPersonas() {
        return personas;
    }


    private void enviar() {
        this.personas.put(jtxtNombre.getText(),new Point((int)(Math.random()*myCanvas.getWidth()),(int)(Math.random()*myCanvas.getHeight())));
        this.myCanvas.repaint();
        jtxtNombre.setText("");
        jtxtNombre.requestFocus();
    }

}