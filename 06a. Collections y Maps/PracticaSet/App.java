import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class App {

    public static void main (String argv[])
    {
        Collection<Candidato> candidatosPSOE = new HashSet<>();
        Collection<Candidato> candidatosPP = new TreeSet<>();


        candidatosPSOE.add(new Candidato("Ignacio","Gabilondo","Pujol"));
        candidatosPP.add(new Candidato("Isabel","Diaz","Ayuso") );
        candidatosPP.add(new Candidato("David","Perez","García") );
        candidatosPP.add(new Candidato("Ana","Camins","Martínez"));
        candidatosPP.add(new Candidato("María Eugenia","Carballedo"," Berlanga"));
        candidatosPP.add(new Candidato("Pedro Manuel","Rollán","Ojeda"));



        Collection<Collection<Candidato>> partidos = new HashSet<>();

        partidos.add(candidatosPSOE);
        partidos.add(candidatosPP);

        for(Collection<Candidato> p : partidos)
            for(Candidato c: p)
                System.out.println(c);



    }
}
