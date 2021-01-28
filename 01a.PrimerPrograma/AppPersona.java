public class AppPersona
{
  public static void main (String argv [])
  {
     Persona p1 = new Persona();
     p1.setNombre("Anthony");
     p1.setApellido1("Hopkins");
     p1.setEdad(84);
     
     System.out.println(p1.getNombre());
     System.out.println(p1.getApellido1());     
     System.out.println(p1.getEdad());
     
     
     System.out.println(p1.getNombre() + " " + p1.getApellido1());   
     
     
     Persona p2 = new Persona("Paco","Sanchez","De la Cerda",17);
     
     //System.out.println(p2.getNombre() + " " + p2.getApellido1() + ", Edad: " + p2.getEdad());   

     System.out.println();
     System.out.println();
     System.out.println(p1.getInfo());       
     System.out.println(p2.getInfo());  
     
     //System.out.println(p1.getNombre() + " Es mayor de edad: " + p1.isMayorEdad());
     //System.out.println(p2.getNombre() + " Es mayor de edad: " + p2.isMayorEdad());
     
     System.out.println(p1.getNombre() + " " + p1.isMayorEdadTexto());
     System.out.println(p2.getNombre() + " " + p2.isMayorEdadTexto());
     
     String nombre = p1.getNombre();
     nombre = nombre.toUpperCase();
     System.out.println(nombre);
     
     System.out.println(p2.getNombre().toUpperCase());
     
     String s1 = new String("esto es una cadena");

     String s2 = "esto es una cadena";
     
     if(s1 == s2)
       System.out.println("Las dos cadenas son iguales");
     else
       System.out.println("Las dos cadenas en contenido son iguales, pero las referencias de estos dos objetos son distintas");
          
     
     
     
     
     /*
     int i1 = 20;
     int i2 = 30;
     
     System.out.println(i1 + "" + i2);*/
     
     
     
     
  }
}
