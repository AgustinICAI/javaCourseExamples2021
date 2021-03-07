package examenInter2013.domain;

public class Alumno extends Persona
{
  float notaMedia;
  
  public Persona(byte edad, String nombre,float notaMedia)
  {
    this.edad = edad;
    this.nombre = nombre;
  }
  
  public int indexar(int arraySize)
  {
    /* 
    Aprovenchando que parte de la lógica está implementada en la clase padre
    "media entre el módulo de la edad y el tamaño del array y
    el módulo de la nota media y la tamaño del array"
    */
    return (super.indexar(arraySize) + notamedia%arraySize) / 2;
  }
  
  public Imprimible()
  {
    System.out.println("Alumno: " + super.getNombre() +", " + super.getEdad() + ", " + notaMedia); 
  }

}
