public class AppConversion
{
  public static void main(String argv[])
  {
    int i0 = 63;
    double d1 = 412341.4123d;
    float f1 = 3442341.132f;
    boolean b1 = true;
    byte b2 = 54;
    long l1 = 4123412123L;
    
    double d2 = i0;
    float f2 = i0;
    
    System.out.println (d2);
    System.out.println (f2);
    
    int i1 = (int)d1;
    System.out.println (i1);
    
    byte b3 = (byte)i0;
    System.out.println (b3);
        
    
      
  }


}
