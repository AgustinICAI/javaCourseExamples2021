package icai.examen.diciembre2014.ui;

import icai.examen.diciembre2014.domain.*;
import com.david.io.IOObjetos;

public class VentanaPedidos extends JFrame
{
  public static void main()
  {
    HashSet<Vehiculo> vehiculos = VentanaPedidos.cargaVehiculos();
    TreeSet<Envio> envios = VentanaPedidos.cargaEnvios();
    
    HashMap<Envio,Vehiculo> hm = new HashMap<>();
    //PTE ASIGNACION DE ENVIOS A VEHICULOS
    
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
  
  
  
  
  public VentanaPedidos()
  {
  
  
  
  }




}
