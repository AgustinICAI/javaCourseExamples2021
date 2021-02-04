/* Definición de la clase que va a permitir crear objetos de tipo persona */
public class Persona
{
  //ATRIBUTOS
  private String nombre;
  private String apellido1;
  private String apellido2; //LOS OBJETOS (en este caso de tipo String) POR DEFECTO SE INICIALIZAN A "null"
  private int edad; //LOS TIPOS PRIMITIVOS DEPENDIENDO DEL TIPO PRIMITIVO, los int a 0
  private String direccion;
  
  static final int EDADMAYORIAEDAD = 18;
  static int EDAD_LIMITE_SUPERIOR = 140;  
  static int EDAD_LIMITE_INFERIOR = 0;  
  
  //CONSTRUCTOR POR DEFECTO. JAVA SINO DEFINES CONSTRUCTORES, SIEMPRE CREA EL DE POR DEFECTO
  public Persona()
  {
  
  }
  
  public Persona(String nombre, String apellido1, int edad)
  {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.setEdad(edad);
  }
  
  public Persona(String nombre, String apellido1)
  {
    this.nombre = nombre;
    this.apellido1 = apellido1;
  }
  
  //MÉTODOS
  public String getNombre()
  {
    return this.nombre;
  }
  
  public String getApellido1()
  {
    return this.apellido1;
  }
  public String getApellido2()
  {
    return this.apellido2;
  }
    
  public int getEdad()
  {
    return this.edad;
  }

  public void setEdad(int edad)
  {
    if (edad >= EDAD_LIMITE_INFERIOR && edad <= EDAD_LIMITE_SUPERIOR)
    	this.edad = edad;
  }
  
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  public void setApellido1(String apellido1)
  {
    this.apellido1 = apellido1;
  }
  
  public boolean isMayorEdad()
  {
    /*if (this.getEdad() >= 18)
      return true;
    else return false;*/
    
    return this.getEdad() >= EDADMAYORIAEDAD;
  }
  
  public String isMayorEdadTexto()
  {
    if(this.isMayorEdad() == true)
    {
      return "Es mayor de edad";
    }
    else return "Es menor de edad";
    
  }
  
  
  public String getInfo()
  {
    if (this.getApellido2() == null)
      return this.getNombre() + " " + this.getApellido1() + ", Edad: " + this.getEdad();
    else
      return this.getNombre() + " " + this.getApellido1() + " " + this.getApellido2() + ", Edad: " + this.getEdad();
  }
  
  static void setEDAD_LIMITE_SUPERIOR(int edad)
  {
    EDAD_LIMITE_SUPERIOR = edad;
  }
  
  static int getEDAD_LIMITE_SUPERIOR()
  {
    return EDAD_LIMITE_SUPERIOR;
  }
  
  
}
