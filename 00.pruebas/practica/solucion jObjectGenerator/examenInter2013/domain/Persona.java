package examenInter2013.domain;

public class Persona implements Indexable, Imprimible
{
  byte edad;
  String nombre;
  public Persona(String nombre, byte edad )
  {
    this.edad = edad;
    this.nombre = nombre;
  }
  
  public int indexar(int arraySize)
  {
    return edad%arraySize;
  }
  
  public Imprimible()
  {
    System.out.println("Persona: " + nombre +", " + edad); 
  }

}
