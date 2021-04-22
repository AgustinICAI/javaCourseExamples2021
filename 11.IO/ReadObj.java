import java.io.*;

public class ReadObj {
    public static void main(String argv[])
    {
        try {
            ObjectInputStream ios = new ObjectInputStream(new FileInputStream(new File("./objetos.obj")));
            try {
                while (true) {
                    Object o1 = ios.readObject();
                    System.out.println(o1);
                }
            }catch (EOFException eofException)
            {
                ios.close();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
