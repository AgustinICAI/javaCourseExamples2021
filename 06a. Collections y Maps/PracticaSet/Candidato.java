import java.util.Collections;
import java.util.Objects;

public class Candidato implements Comparable{
    String nombre;
    String apellido1;
    String apellido2;

    public Candidato(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidato)) return false;
        Candidato candidato = (Candidato) o;
        return nombre.equals(candidato.nombre) && apellido1.equals(candidato.apellido1) && apellido2.equals(candidato.apellido2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido1, apellido2);

    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }



    @Override
    public int compareTo(Object o) {
        //PENDIENTE REVISAR VERSIÓN SIMPLIFICADA DE COMPARETO
        if (o instanceof Candidato)
        {
            Candidato c = (Candidato)o;
            if (this.apellido1.equals(c.getApellido1()))
            {
                if(this.apellido2.equals(c.getApellido2()))
                {
                    if(this.nombre.equals(c.getNombre()))
                        return 0;
                    return this.nombre.compareTo(c.getNombre());
                }
                return this.apellido2.compareTo(c.getApellido2());
            }
            return this.apellido1.compareTo(c.getApellido1());
        }
        return -1;
    }


}
