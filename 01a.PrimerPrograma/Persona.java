/* Definición de la clase que va a permitir crear objetos de tipo persona */
public class Persona
{
  //ATRIBUTOS
  String nombre;
  String apellido1;
  String apellido2; //LOS OBJETOS (en este caso de tipo String) POR DEFECTO SE INICIALIZAN A "null"
  int edad; //LOS TIPOS PRIMITIVOS DEPENDIENDO DEL TIPO PRIMITIVO, los int a 0
  String direccion;
  
  //CONSTRUCTOR POR DEFECTO. JAVA SINO DEFINES CONSTRUCTORES, SIEMPRE CREA EL DE POR DEFECTO
  
  public Persona()
  {
  
  }
  
  public Persona(String nombre, String apellido1,String apellido2, String direccion, int edad)
  {
    this(nombre, apellido1,apellido2, edad);
    /*
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;*/
    this.direccion = direccion;
    //this.edad = edad;
  }
  
  public Persona(String nombre, String apellido1, String apellido2, int edad)
  {
    this(nombre, apellido1, edad);
    this.apellido2 = apellido2;
  }
  
  public Persona(String nombre, String apellido1, int edad)
  {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.edad = edad;
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
    
    return this.getEdad() >= 18;
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
  
  
  
}
