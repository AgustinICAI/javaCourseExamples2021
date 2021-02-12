public class Soltero extends Concursante
{  
  public Soltero(String nombre, int edad,String sexo, String fechaEntrada)
  {
    super(nombre,edad,sexo,fechaEntrada);
  }
  
  public String getEstancia()
  {
    if (super.getSexo() == "masculino")
      return "Villa Montaña";
    else
      return "Villa Playa";  
  }
    
  public String toString()
  {
      return super.toString() + "\n" +
           "================================================================================\n"+
           "estancia: "+ this.getEstancia() + ", Soltero"; 

  }
  
  public void expulsado(String fechaExpulsion)
  {
    System.out.println(this.getNombre() + " ha sido expulsado");
    setFechaExpulsion(fechaExpulsion);
  }

}
