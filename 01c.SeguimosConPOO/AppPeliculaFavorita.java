import java.util.Arrays;

public class AppPeliculaFavorita
{
  public static void main(String argv[])
  {
  
    Pelicula pe1 = new Pelicula("El Padre",180);
    
    Persona p1 = new Persona("Juan", "Perez", 20, pe1);
    
    System.out.println(p1.getPeliculaFavorita());
    
    Pelicula pe2 = p1.getPeliculaFavorita();
    System.out.println(pe2);
    System.out.println(pe1);
    
    Pelicula pe3 = new Pelicula("El Padre");
    System.out.println(pe3);
    
    
    System.out.println(p1.getPeliculaFavorita().getNombre());
    System.out.println(pe2.getNombre());
    
    p1.getPeliculaFavorita().setNombre("Batman 3ro");
    System.out.println(p1.getPeliculaFavorita().getInfo());
    
    p1.setPeliculaFavorita(new Pelicula("Batman 4to"));
    System.out.println(p1.getPeliculaFavorita().getInfo());
    
    
    int[] a = new int [5];
    System.out.println(Arrays.toString(a));
    
    
    
    
  }




}

