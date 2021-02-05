public class Concursante extends Persona
{
  Persona parejaActual;
  String estancia;
  int mesesRelacion;
  
  public Concursante(String nombre, int edad,String sexo)
  {
    super(nombre,edad,sexo);
  }
  public String getEstancia()
  {
    if ((parejaActual == null && super.getSexo() == "masculino") ||
        (parejaActual != null && super.getSexo() == "femenino"))
      return "Villa Montaña";
    else
      return "Villa Playa";  
    
  }

  public Persona getParejaActual()
  {
    return this.parejaActual;
  }
  public int getMesesRelacion()
  {
    return this.mesesRelacion;
  }
  public void setEstancia(String estancia)
  {
    this.estancia = estancia;
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
    return this.getNombre() + ", Edad: " + this.getEdad() + ", Sexo: " + this.getSexo() + "\n" +
           "================================================================================\n"+
           "estancia: "+ this.getEstancia() + ", Pareja: " + this.getParejaActual().getNombre()+"\n\n"; 
    
  }


}
