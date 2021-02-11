public class Casado extends Concursante
{
  Persona parejaActual;
  int mesesRelacion;
  
  public Casado(String nombre, int edad,String sexo)
  {
    super(nombre,edad,sexo);
  }
  public String getEstancia()
  {
    if (super.getSexo() == "femenino")
      return "Villa Montaña";
    else
      return "Villa Playa";  
  }
  
  public void pedirCita (Persona p)
  {
    System.out.println(this.getNombre() + " quiere una cita con " + p.getNombre());
  }

  public Persona getParejaActual()
  {
    return this.parejaActual;
  }
  public int getMesesRelacion()
  {
    return this.mesesRelacion;
  }
  
  public void setParejaActual(Persona parejaActual)
  {
    this.parejaActual = parejaActual;
  }
  
  public void setMesesRelacion()
  {
    this.mesesRelacion = mesesRelacion;
  }
  
  public String toString()
  {
      return super.toString() + "\n" +
           "================================================================================\n"+
           "estancia: "+ this.getEstancia() + ", Pareja: " + this.getParejaActual().getNombre()+"\n\n"; 

  }


}
