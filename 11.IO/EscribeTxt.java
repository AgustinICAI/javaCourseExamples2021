import java.io.*;

public class EscribeTxt {
    public static void main(String argv[])
    {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("./Personas.csv"))));
            pw.println("Nombre;Edad");
            pw.println(new Persona("Juan",23).toCSVLine());
            pw.println(new Persona("Pepe",25).toCSVLine());
            pw.println(new Persona("Pepe",25).toCSVLine());
            pw.println(new Persona("Pepe",25).toCSVLine());
            pw.println(new Persona("Pepe",25).toCSVLine());
            pw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
