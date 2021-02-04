import java.util.Arrays;

public class AppPelicula2
{
  public static void main(String argv[])
  {     
    Persona p[] = new Persona[5];
    p[2] = new Persona("Chuck","Norris",80);
    p[4] = new Persona("Juan","Nevado",20);
    p[1] = new Persona("Alicia","Keys",20);
    
    
    
    //while
    int i = 0;
    while (i < p.length)
    {
      if (p[i] != null) 
        System.out.println("Pos " + i + "-"+p[i].getInfo());
        i = i + 1;
    }
    
    //for
    for (int j = 0; j < p.length ; j++)
      if (p[j] != null) 
      {
        System.out.println("Pos " + j + "-"+p[j].getInfo());  
      }  

    //for each
    for (Persona k : p)
      if (k != null)
        System.out.println(k.getInfo());  
   
    //En python 
    /*
      p = []
      p.append({"nombre":"pepe"})
      for k in p:
        print(k)
    */
    
    //do_while
    //Mirad en casa
    
    
    
    
    
    
    
    
    
  }




}

