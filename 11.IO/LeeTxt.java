import java.io.*;
import java.util.ArrayList;

public class LeeTxt {
    public static void main(String argv[])
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("./Personas.csv")));
            /*
            String linea = br.readLine();
            while(linea != null)
            {
                System.out.println(linea);
                linea = br.readLine();
            }*/
            ArrayList<Persona> personas = new ArrayList<>();
            String linea = br.readLine();
            while((linea = br.readLine())!=null) {
                personas.add(Persona.fromCSVLine(linea));
            }

            System.out.println(personas);



            br.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
