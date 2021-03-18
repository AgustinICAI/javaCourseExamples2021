package es.icai.practicaList;

import es.icai.practicaList.domain.Entrenador;
import es.icai.practicaList.domain.Equipo;
import es.icai.practicaList.domain.Jugador;
import es.icai.practicaList.domain.Presidente;

public class Main {

    public static void main(String[] args) {
        Equipo equipo = new Equipo("Barça");

        equipo.setPresidente(new Presidente("Joan Laporta", 58, 150000));
        equipo.setCoach(new Entrenador("Ronald Koeman", 57, 250000));

        equipo.ficharJugador(new Jugador("Messi",32,80000000));
        equipo.ficharJugador(new Jugador("Suarez",33,30000000));

        System.out.println(equipo);

    }
}
