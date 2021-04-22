import java.io.Serializable;
import java.util.Locale;

public class Persona implements Serializable {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toCSVLine()
    {
        return this.nombre + ";" + this.edad;
    }

    public static Persona fromCSVLine(String line)
    {
        String campos[] = line.split(";");
        return new Persona(campos[0],Integer.parseInt(campos[1]));

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
