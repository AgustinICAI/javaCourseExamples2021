package islaDeLasTentaciones.ui;

import islaDeLasTentaciones.domain.*;
/*
import islaDeLasTentaciones.domain.Soltero;
import islaDeLasTentaciones.domain.Concurso;
import islaDeLasTentaciones.domain.Casado;
*/

public class AppConcurso
{
  public static void main (String argv[])
  {
    Concurso concurso = new Concurso("2021",new Persona("Sandra","Barneda"));
    
    concurso.addSoltero(new Soltero("Manuel",28, "masculino","10/01/2021"));
    concurso.addSoltero(new Soltero("Ignacio",28, "masculino","10/01/2021"));
    concurso.addSoltero(new Soltero("Fiama",28, "femenino","10/01/2021"));
    concurso.addSoltero(new Soltero("Mencía",28, "femenino","10/01/2021"));
    
    concurso.addPareja(new Casado("Lola", 29, "femenino","10/01/2021"),new Casado("Diego", 30, "masculino","10/01/2021"));
  	
    System.out.println(concurso);
    
    Soltero s1 = new Soltero("Ignacio",28, "masculino","10/01/2021");
        
    concurso.celebrarHoguera("Mencía");  
    concurso.celebrarHoguera(s1);   
         
    System.out.println(concurso);
    
    
    
  }

}
