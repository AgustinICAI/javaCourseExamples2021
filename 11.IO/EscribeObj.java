import java.io.*;

public class EscribeObj {
    public static void main(String argv[])
    {
        File ficheroSalida = new File("./objetos.obj");

        try {
            FileOutputStream fos = new FileOutputStream(ficheroSalida);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(new Persona("Juan",23));
            oos.writeObject(new Persona("Pepe",25));
            oos.writeObject(new Persona("Pepe",25));
            oos.writeObject(new Persona("Pepe",25));
            oos.writeObject(new Persona("Pepe",25));

            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
