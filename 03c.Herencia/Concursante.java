public abstract class Concursante extends Persona implements Nominable
{  
  String fechaEntrada;
  String fechaExpulsion;  
  
  public Concursante(String nombre, int edad,String sexo, String fechaEntrada)
  {
    super(nombre,edad,sexo);
    this.fechaEntrada = fechaEntrada;
  }
  
  public abstract String getEstancia();
  
  public void setFechaExpulsion(String fechaExpulsion)
  {
    this.fechaExpulsion = fechaExpulsion;
  }
  
  public void nominado()
  {
    System.out.println(this.getNombre() + " ha sido nominado");
  }
  

  

}
