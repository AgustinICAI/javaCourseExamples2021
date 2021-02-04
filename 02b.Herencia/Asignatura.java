public class Asignatura{
  private String nombre;
  private double creditos;
  
  public Asignatura(String nombre)
  {
    this.nombre = nombre;
  }

  public Asignatura(String nombre,double creditos)
  {
    this.nombre = nombre;
    this.creditos = creditos;
  }
  
  public String getNombre()
  {
    return  this.nombre;
  }

  public double getCreditos()
  {
    return this.creditos;
  }
  
  public void setNombre(String nombre)
  {
     this.nombre = nombre;
  }



}
