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

    
  }

}
