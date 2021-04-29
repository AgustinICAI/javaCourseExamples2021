package icai.examen.diciembre2014.domain;

public class EnvioPaquete extends Envio
{
  private double peso;
  private double volumen;
  
  public double getFactorCarga()
  {
    return peso*volumen;
  }

  public double getCosteBase()
  {
    return Envio.COSTEBASE*this.getFactorCarga();
  }


}
