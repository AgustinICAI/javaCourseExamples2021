import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App2 {

    public static void main(String argv[])
    {
        /*
        Ayuso -> Hummer
        Gabilondo -> Renault Zoe
        Pablo -> Limusina
        Toni Canto -> Tesla
        Monica Garcia -> Tesla
         */

        TreeMap<Candidato,Coche> hm = new TreeMap<>();

        hm.put(new Candidato("Isabel","Diaz","Ayuso"), new Coche("Hummer","v1"));
        hm.put(new Candidato("Ignacio","Gabilondo","Pujol"), new Coche("Renault","Zoe"));
        hm.put(new Candidato("Toni","Cantó",""), new Coche("Tesla","Model S"));
        hm.put(new Candidato("Monica","García",""), new Coche("Tesla","Model S"));

        System.out.println(hm);

        for(Map.Entry<Candidato,Coche> e : hm.entrySet())
        {
            System.out.println(e.getKey() + ";" + e.getValue() );
        }


    }

}
