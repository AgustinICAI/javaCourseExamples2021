package es.icai.practicaList.domain;

public class Presidente  extends Trabajador {
    String nombre;
    int edad;
    double sueldo;

    public Presidente(String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
    }
}
