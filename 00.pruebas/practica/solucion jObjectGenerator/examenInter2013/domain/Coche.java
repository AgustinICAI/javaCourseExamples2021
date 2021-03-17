package examenInter2013.domain;

public class Coche implements Indexable, Imprimible
{
  int caballos;
  String marca;
  public Coche(int caballos , String marca)
  {
    this.marca = marca;
    this.caballos = caballos;
  }
  
  public int indexar(int arraySize)
  {
    return caballos%Integer.MAX_VALUE;
  }

  public Imprimible()
  {
    System.out.println("Coche: " + marca +", " + caballos); 
  }

}
