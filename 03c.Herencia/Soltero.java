public class Soltero extends Concursante
{  
  public Soltero(String nombre, int edad,String sexo)
  {
    super(nombre,edad,sexo);
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

}
