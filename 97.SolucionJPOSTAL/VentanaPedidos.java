package icai.examen.diciembre2014.ui;

import icai.examen.diciembre2014.domain.*;

import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.david.io.IOObjetos;

public class VentanaPedidos extends JFrame
{
  public static void main()
  {
    HashSet<Vehiculo> vehiculos = VentanaPedidos.cargaVehiculos();
    TreeSet<Envio> envios = VentanaPedidos.cargaEnvios();
    
    HashMap<Envio,Vehiculo> hm = VentanaPedidos.asignarPedidos(envios, vehiculos);

    new VentanaPedidos(hm);
  
  }
  
  public static Collection cargaVehiculos()
  {
    HashSet<Vehiculo> vehiculos = new HashSet<>();
    IOObjetos ioo = new IOObjetos();
    try{
      while(true)
      {
        Object o = ioo.leerObjeto("vehiculos.obj");
        vehiculos.add((Envio)o);
      }
    
    }catch(EOFException e)
    {
      
    }catch(IOException e)
    {
    
    }
    return vehiculos;  
  }
  
  public static TreeSet<Envio> cargaPedidos()
  {
    TreeSet<Envio> envios = new TreeSet<>();
    IOObjetos ioo = new IOObjetos();
    try{
      while(true)
      {
        Object o = ioo.leerObjeto("envios.obj");
        envios.add((Envio)o);
      }
    
    }catch(EOFException e)
    {
      
    }catch(IOException e)
    {
    
    }
    return envios;
  }
  
  public static HashMap<Envio,Vehiculo> asignarPedidos (Collection<E> envios, Collecion vehiculos)
  {
      HashMap<Envio,Vehiculo> envioVehiculo = new HashMap<>();

      Iterator<Envio> itEnvios = envios.iterator();
      Iterator<Vehiculo> itVehiculos = vehiculos.iterator();

      double factorCargaVehiculo = 0;
      Envio e = itEnvios.next();
      Vehiculo v = itVehiculos.next();

      while (itEnvios.hasNext() && itVehiculos.hasNext())
      {
        if(e.getFactorCarga() + factorCargaVehiculo < v.getFactorCarga())
        {
          envioVehiculo.put(e,v);
          factorCargaVehiculo += e.getFactorCarga();
          e = itEnvios.next();
        }
        else
        {
          v = itVehiculos.next();
          factorCargaVehiculo = 0;
        }
      }
      if(e.getFactorCarga() + factorCargaVehiculo < v.getFactorCarga())
      {
        envioVehiculo.put(e,v);
      }


      return envioVehiculo;


  }
  
  
  
  public VentanaPedidos(HashMap<Envio,Vehiculo> envioVehiculo)
  {
    JLabel lblEnvio = new JLabel("Identificador del envio");
    JTextField txtEnvio = new JTextField("");
    JButton btnEnvio = new JButton("buscar");
      
    this.add(lblEnvio, BorderLayout.WEST);
    this.add(txtEnvio, BorderLayout.CENTER);
    this.add(btnEnvio, BorderLayout.EAST);


    JPanel pnlBotones = new JPanel();
    JButton btnVerVehiculo = new JButton("Ver vehiculo");
    JButton btnVerPrecio = new JButton("Ver precio");
    JButton btnExportar = new JButton("exportar");

    pnlBotones.add(btnVerVehiculo);
    pnlBotones.add(btnVerPrecio);
    pnlBotones.add(btnExportar);
    pnlBotones.setVisible(false);

    JPanel pnlIdentificadorInexistente = new JPanel();
    pnlIdentificadorInexistente.add(new JLabel("Identificador inexistente"));
    pnlIdentificadorInexistente.setVisible(false);

    JPanel pnlSouth = new JPanel();
    pnlSouth.setLayout(new GridLayout (2,1));
    pnlSouth.add(pnlBotones);
    pnlSouth.add(pnlIdentificadorInexistente);

    this.pack();
    this.setVisible(true);
    this.setDefaultOperationOnClose(JFrame.EXIT);
  
  }




}
