public class Concurso
{
  String anoEdicion;
  Persona presentador;
  Concursante[] concursantes;
  int numActual = 0;
  static int NUMTOTALCONCURSANTES = 30;

  public Concurso (String anoEdicion, Persona presentador)
  {
    this.anoEdicion = anoEdicion;
    this.presentador = presentador;
    this.concursantes = new Concursante[NUMTOTALCONCURSANTES];
  }

  public void addConcursante(Concursante c)
  {
    if(numActual < NUMTOTALCONCURSANTES)
    {
      concursantes[numActual] = c;
      numActual += 1;
    }
    else
    {
      System.out.println("No caben más concursantes");
    }
  }
  public void addSoltero(Concursante c)
  {
    this.addConcursante(c);
  }
  
  public void addPareja(Casado c1, Casado c2)
  {
    this.addConcursante(c1);
    this.addConcursante(c2);
    c1.setParejaActual(c2);
    c2.setParejaActual(c1);
    /*Si lo que pasamos como argumento es Concursante, entonces habrá que hacer downcastign
    ((Casado)c1).setParejaActual(c2);
    ((Casado)c2).setParejaActual(c1);
    */
  }
  public void celebrarHoguera(Soltero solteroExpulsado)
  {
    boolean concursanteEncontrado = false;
    for(int i = 0; i < concursantes.length; i++)
    {
      if (concursantes[i] !=null && concursantes[i] instanceof Soltero && concursantes[i].equals(solteroExpulsado))
      {
        concursantes[i] = null;
        concursanteEncontrado = true;
      }
      if (concursanteEncontrado)
      {
        if (i+1 < NUMTOTALCONCURSANTES)
          concursantes[i] = concursantes[i+1];
        else
          concursantes[i] = null;
      }
    }  
  }
  
  
  public void celebrarHoguera(String solteroExpulsado)
  {
    boolean concursanteEncontrado = false;
    for(int i = 0; i < concursantes.length; i++)
    {
      if (concursantes[i] !=null && concursantes[i] instanceof Soltero && concursantes[i].getNombre().equals(solteroExpulsado))
      {
        concursantes[i] = null;
        concursanteEncontrado = true;
      }
      if (concursanteEncontrado)
      {
        if (i+1 < NUMTOTALCONCURSANTES)
          concursantes[i] = concursantes[i+1];
        else
          concursantes[i] = null;
      }
    }
        
  }
  
  public String toString()
  {
    String salida = anoEdicion + " - Presentador: " + presentador + "\n";
    salida += "============Concursantes============\n";
    for(Concursante c : concursantes)
      if (c !=null)
        salida += c + "\n";
    return salida;
  }

}
