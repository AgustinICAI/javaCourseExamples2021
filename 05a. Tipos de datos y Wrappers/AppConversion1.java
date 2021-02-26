public class AppConversion1
{
  public static void main(String argv[])
  {
    //Integer i0 = new Integer(34);  
    //System.out.println(i0.toString());
    
    Integer i0 = 34;
    
    Double d0 = 23123.3d;
    
    Boolean b1 = false;
    
    char c1 = 229;
    char c2 = 'Ñ';
    
    
    String s1 = "5424dfsfd,2312312,12412415";
    
    
   String[] numsTexto = s1.split(",");
   
   int[] nums = new int [numsTexto.length];
   
   for (int i = 0; i<numsTexto.length; i++)
   {
     nums[i] = Integer.valueOf(numsTexto[i]).intValue();
     nums[i] = Integer.parseInt(numsTexto[i]).intValue();
     
   }

   for (int n : nums)
     System.out.println(n+1);
   
   
      
  }


}
