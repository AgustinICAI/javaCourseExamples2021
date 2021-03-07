package examenInter2013.ui;
import examenInter2013.util.ObjectGenerator;
import examenInter2013.profesor.Print;

public class App{

    public static void main(String argv[])
    {

      Object[] objetos = new Object[10];
      for (int i = 0; i<4; i++)
      {
        Object o = ObjectGenerator.generate();
        int posicion = o.indexar(objetos.length);
        //Cuando el método indexar devuelva una posición ya ocupada por otro objeto,
        //el objeto no será insertado 
        if (objetos[posicion]!=null)
          objetos[posicion] = o;
      }
      int impresionesConExito = 0;
      for (Object o : objetos)
      {
        if (Print.job(o))
          impresionesConExito += 1;
      }
      System.out.println("Impresiones con éxito: " + impresionesConExito);
      

    }

}
