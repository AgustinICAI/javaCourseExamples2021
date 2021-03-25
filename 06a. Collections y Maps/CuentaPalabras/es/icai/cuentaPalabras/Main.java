package es.icai.cuentaPalabras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> palabrasCount = new HashMap<>();
        HashSet<String> stopWords = new HashSet<>();
        try {
            String linea;

            BufferedReader br = new BufferedReader(new FileReader(new File("/home/b0904853/IdeaProjects/CuentaPalabras/src/stop_words_spanish.txt")));
            while ((linea = br.readLine()) !=null)
                stopWords.add(linea.toUpperCase());

            br = new BufferedReader(new FileReader(new File("/home/b0904853/IdeaProjects/CuentaPalabras/src/discurso.txt")));
            while ((linea = br.readLine()) !=null)
            {
                String palabras[] = linea.toUpperCase().split("\\.|\\s|,|:|[0-9]+");
                for(String palabra : palabras)
                    if(!stopWords.contains(palabra))
                        if(palabrasCount.containsKey(palabra))
                            /*
                            int count = palabrasCount.get(palabra);
                            count += 1;
                            palabrasCount.put(palabra,count);*/
                            palabrasCount.put(palabra,palabrasCount.get(palabra)+1);
                        else
                            palabrasCount.put(palabra,1);
            }



        }catch (Exception e)
        {
            e.printStackTrace();
        }

        TreeMap<Integer, LinkedList<String>>  palabrasOrdenadas = new TreeMap<>();
        for(Map.Entry<String,Integer> m : palabrasCount.entrySet())
        {
            String palabra = m.getKey();
            int count = m.getValue();
            if(!palabrasOrdenadas.containsKey(count))
                palabrasOrdenadas.put(count,new LinkedList<>());

            palabrasOrdenadas.get(count).add(palabra);
        }

        //for(Map.Entry<Integer,LinkedList<String>> m : palabrasOrdenadas.descendingMap().entrySet())
        //    System.out.println(m.getKey()+" -> "+m.getValue());
        for(Integer c : palabrasOrdenadas.descendingKeySet())
            System.out.println(c+" -> "+ palabrasOrdenadas.get(c));

    }

}
