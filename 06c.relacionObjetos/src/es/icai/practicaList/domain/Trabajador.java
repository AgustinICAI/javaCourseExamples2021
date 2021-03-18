package es.icai.practicaList.domain;

import java.util.Objects;

public class Trabajador {
    String nombre;
    int edad;
    double sueldo;

    public Trabajador(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.getNombre()+ "," + this.getEdad() + "," + this.getSueldo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trabajador)) return false;
        Trabajador that = (Trabajador) o;
        return getNombre().equals(that.getNombre());
    }

}
