import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class App
{
  public static void main(String argv[])
  {
    Collection coleccion = new LinkedList();
    coleccion.add(new Soltero("Manuel", 30, "masculino", "04-03-2021"));    
    coleccion.add(new Soltero("Lola", 30, "femenino", "04-03-2021"));
    coleccion.add(new Soltero("Juan", 30, "masculino", "04-03-2021"));
    coleccion.add(new Soltero("Lola", 30, "femenino", "04-03-2021"));
    
    //ArrayList ar = (ArrayList)coleccion;
    //System.out.println("Mostrando el elemento en posición 3:\n" + ar.get(3));
    
    
    for(Object o : coleccion)
      System.out.println(o);
    
    System.out.println(coleccion.size());
    
    boolean quedanLolas = true;
    while (quedanLolas)
      quedanLolas = coleccion.remove(new Persona("Lola"));
  
  
    for(Object o : coleccion)
      System.out.println(o);
    
    System.out.println(coleccion.size());  
    
    
    Iterator it = coleccion.iterator();
    //next()
    //hasNext()
    
    while (it.hasNext())
      System.out.println(it.next());
    
    
    
    
    
  }

}



