public class AppConcurso
{
  public static void main (String argv[])
  {
    Concursante [] concunsantes = new Concursante[30];
    
    
    //Hago upcasting para poder agrupar funcionalidad de todos mis concursantse
    concunsantes[0] = new Casado("Lola", 29, "femenino");
    concunsantes[1] = new Casado("Diego", 30, "masculino");
    concunsantes[2] = new Soltero("Manuel",28, "masculino");
        
    //Hago downcasting para acceder a métodos de un objeto hijo
    ((Casado)concunsantes[0]).setParejaActual(c2);
    ((Casado)concunsantes[1]).setParejaActual(c1);
    
    
    for(Concursante c : concursantes)
    {
      System.out.println (c);
    
    }
    
    //((Casado)c1).pedirCita(s1);
    
    System.out.println(c1.getEstancia());
    System.out.println(c2.getEstancia());
    System.out.println(s1.getEstancia());
    
    
    
    
        
    
    
    
  }

}
