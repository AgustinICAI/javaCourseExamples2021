package es.icai.practicaList.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Equipo {
    String nombre;
    Collection jugadores;
    Presidente presidente;
    Entrenador coach;
    Entrenador entrenadorSegundo;

    static int TAMANO_MIN_EQUIPO = 17;
    static int TAMANO_MAX_EQUIPO = 25;

    public Equipo(String nombre)
    {
        this.nombre = nombre;
        jugadores = new LinkedList();
    }

    public boolean ficharJugador(Jugador j){
        if (jugadores.size() <= TAMANO_MAX_EQUIPO)
            return jugadores.add(j);
        else
            return false;
    }

    public boolean echarJugador(Jugador j)
    {
        return jugadores.remove(j);
    }


    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public Entrenador getCoach() {
        return coach;
    }

    public void setCoach(Entrenador coach) {
        this.coach = coach;
    }

    public Entrenador getEntrenadorSegundo() {
        return entrenadorSegundo;
    }

    public void setEntrenadorSegundo(Entrenador entrenadorSegundo) {
        this.entrenadorSegundo = entrenadorSegundo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String cad_jugadores = "";
        for(Object o : jugadores)
            cad_jugadores += o.toString() + "\n";

        return "Equipo: " + getNombre() + "\n" +
               "Jugadores: " + "\n" + cad_jugadores;
    }
}
