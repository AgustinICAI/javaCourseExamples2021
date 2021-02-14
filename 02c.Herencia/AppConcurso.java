public class AppConcurso
{
  public static void main (String argv[])
  {
    Concursante [] concursantes = new Concursante[30];
    
    
    //Hago upcasting para poder agrupar funcionalidad de todos mis concursantse
    concursantes[0] = new Casado("Lola", 29, "femenino","10/01/2021");
    concursantes[1] = new Casado("Diego", 30, "masculino","10/01/2021");
    concursantes[2] = new Soltero("Manuel",28, "masculino","10/01/2021");
        
    //Hago downcasting para acceder a métodos de un objeto hijo
    ((Casado)concursantes[0]).setParejaActual(concursantes[1]);
    ((Casado)concursantes[1]).setParejaActual(concursantes[0]);
    
    
    for(Concursante c : concursantes)
    {
      if (c!=null)
        System.out.println (c);
    }
    
    //((Casado)c1).pedirCita(s1);
    
    for(Concursante c : concursantes)
    {
      if (c!=null)
        System.out.println (c.getEstancia());
    }
    
    System.out.println("Los solteros son");
    for(Concursante c : concursantes)
    {
      if (c!=null && c instanceof Soltero )
        System.out.println (c);
    }
           
    
    concursantes[1].expulsado("11/02/2021");
    
    
  }

}
