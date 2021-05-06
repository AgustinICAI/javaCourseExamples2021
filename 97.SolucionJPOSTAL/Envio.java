package icai.examen.diciembre2014.domain;

public abstract Envio implements Comparable
{
  private String identificador;
  private boolean urgente;
  private double factorCarga;
  private Contacto remitente;
  private Contacto destinatario;
  
  static double COSTEBASE = 0.5d;

  public int compareTo(Object o)
  {
    Envio e = (Envio)o;
    
    if(e.isUrgente() == this.isUrgente())
      return this.identificador.compareTo(e.getIdentificador());
    else if (this.isUrgente() && !e.isUrgente())
      return 1;
    else
      return -1;
  }

  public abstract double getFactorCarga();

  public abstract double getCosteBase();

  

}
