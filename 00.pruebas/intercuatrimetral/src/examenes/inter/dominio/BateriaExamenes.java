package examenes.inter.dominio;

public class BateriaExamenes
{
  final static int sizeArray = 50;
  Examen examenes[] = new Examen[sizeArray];
  int numExamenes = 0;
  
  public boolean addExamen(Examen examen)
  {
    if (numExamenes < sizeArray)
    {
      examenes[numExamenes] = examen;
      numExamenes += 1;
      return true;
    }
    return false;
  }
  
  public BateriaExamenes getExamenesConDificultadEntre(double dInferior, double dSuperior)
  {
    BateriaExamenes examenesEntre = new BateriaExamenes();
    for (Examen e : examenes)
      if (e!=null && e.getDificultad() >= dInferior && e.getDificultad() <= dSuperior)
        examenesEntre.addExamen(e);

    return examenesEntre;
  }
  
  public BateriaExamenes getExamenesConDificultadMas(double dInferior)
  {
    return this.getExamenesConDificultadEntre(dInferior,1d);
  }

  public double getDificultadMediaExamenes()
  {
    double media = 0;
    for (Examen e : examenes)
     if(e!=null)
       media += e.getDificultad();
    return media/numExamenes;
  }
  public Examen getExamenAleatorio()
  {
    return examenes[(int)(numExamenes*Math.random())];
  }
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    for (Examen e : examenes)
     if(e!=null)
       sb.append(e).append("\n");
    return sb.toString();      
  }
}
