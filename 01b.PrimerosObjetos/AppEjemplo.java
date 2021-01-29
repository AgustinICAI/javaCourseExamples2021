public class AppEjemplo
{
  public static void main (String argv [])
  {
  
    String s1 = new String("hola");
    String s2 = new String("hola");
  
  
    char[] caracteres = new char[4];
    caracteres[0] = 'h';
    caracteres[1] = 'o';    
    
    String s3 = new String(caracteres);
    
    String s4 = "hola";
    /*
    if("hola" == "hola") //PENDIENTE REVISAR
      System.out.println("son iguales");
    else
      System.out.println("son distintos"); 
    */
      
    if(s1 == s2)
      System.out.println("son iguales");
    else
      System.out.println("son distintos"); 
      
    //El método equals compara el contenido de las cadenas
    if(s1.equals(s2))
      System.out.println("son iguales");
    else
      System.out.println("son distintos"); 
    
     
    //Dos tipos de variables
    //Objetos
    //Tipos primitivos
    
    //int, float, double, boolean
    
    int i1 = 53; //En la variable i1 guarda directamente el valor
    int i2 = 53;
    System.out.println("Comparando tipos primitivos");
    if (i1 == i2)
      System.out.println("son iguales");
    else
      System.out.println("son distintos");  
    
    float f1 = 41432113.3412314f;
    double d1 = 43131423.412341d;
    
    
    
    
    
  }
}
