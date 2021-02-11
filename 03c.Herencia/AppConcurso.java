public class AppConcurso
{
  public static void main (String argv[])
  {
    //Hago upcasting para poder agrupar funcionalidad de todos mis concursantse
    Concursante c1 = new Casado("Lola", 29, "femenino");
    Concursante c2 = new Casado("Diego", 30, "masculino");
    Concursante s1 = new Soltero("Manuel",28, "masculino");
        
    //Hago downcasting para acceder a métodos de un objeto hijo
    ((Casado)c1).setParejaActual(c2);
    ((Casado)c2).setParejaActual(c1);
    
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(s1);
    
    ((Casado)c1).pedirCita(s1);
    
    System.out.println(c1.getEstancia());
    System.out.println(c2.getEstancia());
    System.out.println(s1.getEstancia());
    
    
    
    
  }

}
