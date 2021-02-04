import java.util.Arrays;

public class AppPelicula3
{
  public static void main(String argv[])
  {     
    Persona p = new Persona ("Pedro", "Sanchez", 45);
    System.out.println(p.getInfo());    
    p.setEdad(46);
    
    System.out.println(p.getInfo());
    
    Persona.setEDAD_LIMITE_SUPERIOR(100);
    
    System.out.println(Persona.EDAD_LIMITE_SUPERIOR);
    
    System.out.println(p.getNombre());
    //Quien haga esto en el examen suspende
    //System.out.println(p.nombre);
    
    
    
  }




}

