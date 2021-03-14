package examenes.inter.ui; 
import examenes.inter.dominio.*;
public class App
{
  public static void main (String argv[])
  {
    BateriaExamenes be = new BateriaExamenes();   
    be.addExamen(new ExamenClasico("programación orientada objetos",1));
    be.addExamen(new ExamenHibrido("circuitos Electrónicos",0.8d,"editor de texto"));
    be.addExamen(new ExamenOnline("Teoría de la Comunicación",0.6d,"cuestionarios","Respondus"));
    be.addExamen(new ExamenClasico("Sistemas digitales II",0.4d));
    be.addExamen(new ExamenHibrido("estadística",0.2d,"editor de texto"));
    be.addExamen(new ExamenOnline("Estadística 21",0.0d,"compilador","OBS"));
    
    System.out.println(be);
    System.out.println("Exámenes entre 30% y 50%");
    System.out.println(be.getExamenesConDificultadEntre(0.3d,0.5d));
    System.out.println("Exámenes más de 50%");
    System.out.println(be.getExamenesConDificultadMas(0.5d));
    System.out.println("Examen aleatorio");
    System.out.println(be.getExamenAleatorio());
    System.out.println("Dificultad media");
    System.out.println(be.getDificultadMediaExamenes());    
  }

}
