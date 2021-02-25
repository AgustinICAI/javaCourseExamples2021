package islaDeLasTentaciones.domain;

public interface Nominable
{
  public abstract void nominado();
  //No hace falta indicar que son abstractos, porque es evidente al ser un interface
  public void expulsado(String fechaExpulsion);
  
}
