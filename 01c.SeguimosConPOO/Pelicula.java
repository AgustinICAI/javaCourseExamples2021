public class Pelicula
{
  String nombre;
  String director;
  int duracion;
  String genero;
  
  public Pelicula(String nombre)
  {
    this.nombre = nombre;
  }
  
  public Pelicula(String nombre,String director, int duracion, String genero)
  {
    this(nombre);
    this.director = director;
    this.duracion = duracion;
    this.genero = genero;
  }
  
  public String getNombre()
  {
    return this.nombre;
  }

  public int getDuracion()
  {
    return this.duracion;
  }
  
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  
  public String getInfo()
  {
    return "nombre: " + this.nombre + ", director: " + this.director + ", duracion" + this.duracion + ", genero" + this.genero;
  }
  

}
