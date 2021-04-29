package icai.examen.diciembre2014.domain;

public class Vehiculo
{
    double factorCarga;
    String matricula;
    
    public boolean equals(Object o)
    {
      if (o instanceof Vehiculo)
      {
        return this.matricula.equals(((Vehiculo)o).getMatricula());
      }
      else
        return false;
    }
    
    public int hashCode()
    {
      return this.matricula.hashCode();
    }
    
}
