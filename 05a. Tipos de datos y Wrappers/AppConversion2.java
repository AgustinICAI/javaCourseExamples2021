public class AppConversion2
{
  public static void main(String argv[])
  {
  /*
  int a = 65 -> Integer -> float -> char -> String ->
devolver el primer carácter en mayúsculas como char -> int -> byte
  
  
  */  
  
    int a = 65;
    Integer b = a;//Integer b = Integer.valueOf(a);
    float c = b;//float c = b.intValue();
    char d = (char) c;
    //String e = new Character(d);deprecada
    String e = Character.valueOf(d).toString();
    char f = e.toUpperCase().charAt(0);
    //char f = Character.valueOf(e.charAt(0)).toUpperCase();
    int g = f;
    byte h = (byte)g;
      
  }


}
