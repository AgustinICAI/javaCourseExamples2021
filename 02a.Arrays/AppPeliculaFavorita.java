import java.util.Arrays;

public class AppPeliculaFavorita
{
  public static void main(String argv[])
  {     
  
    Persona p1 = new Persona("Pepe","Sanchez",80);
    System.out.println(p1);
    
    Persona p[] = new Persona[5];
    System.out.println(Arrays.toString(p));
    
    p[2] = new Persona("Chuck","Norris",80);
    System.out.println(p[2].getInfo());
    
    
    System.out.println(Arrays.toString(p));
    
    p[2].setNombre("Juan");
    System.out.println(p[2].getInfo());
    System.out.println(Arrays.toString(p));
    
    int[] a = new int [5];
    System.out.println(Arrays.toString(a));
    a[4] = 55;
    System.out.println(Arrays.toString(a));
    //Ejemplos de excepciones de java.lang.ArrayIndexOutOfBoundsException y java.lang.NullPointerException
    //a[5] = 65;
    //p[1].getNombre();
    
    p[2] = p1;
    System.out.println(Arrays.toString(p));
    
    
    
    
    
    
    
    
    
    
  }




}

