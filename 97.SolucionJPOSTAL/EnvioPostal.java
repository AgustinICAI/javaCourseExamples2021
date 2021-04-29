package icai.examen.diciembre2014.domain;

public class EnvioPostal extends Envio
{
  private static double FACTORDECARGA = 1;
  
  
  public double getFactorCarga()
  {
    return FACTORDECARGA;
  }
  
  public double getCosteBase()
  {
    return Envio.COSTEBASE;
  }

}
