package islaDeLasTentaciones.domain;

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
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n");
    sb.append("================================================================================\n");
    sb.append("estancia: ");
    sb.append(this.getEstancia());
    sb.append(",Soltero");    

    return sb.toString();

  }
  
  public void expulsado(String fechaExpulsion)
  {
    System.out.println(this.getNombre() + " ha sido expulsado");
    setFechaExpulsion(fechaExpulsion);
  }

}
