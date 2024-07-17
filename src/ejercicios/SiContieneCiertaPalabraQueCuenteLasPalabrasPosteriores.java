package ejercicios;

/*
Si una frase contiene la palabra clave "partir" entonces que diga el tamaño de todas las palabras de ahi en adelante ordenadas por numero de letras
 */

import java.util.*;
import java.util.stream.Stream;

public class SiContieneCiertaPalabraQueCuenteLasPalabrasPosteriores {

    public static void main(String[] args) {
        String frase = "soy la frase y desde la palabra partir debes contar cuantas palabras existen en ella";
        //meter palabras array
        int largo = frase.length();
        String [] array = new String[largo];
        array = frase.split(" ");
        int indice =0;

        //ver si en el array esta "partir"
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("partir")){
                indice = i;
                }
            }
        List<String>stringList = new ArrayList<>(Arrays.asList(array));
        stringList =stringList.subList(indice+1, stringList.size());




        //meter palabras en mapa
        Map<String,Integer>mapa = new TreeMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            mapa.put(stringList.get(i),stringList.get(i).length());
        }
        //ordenar mapa
        System.out.println(mapa);

            List<Map.Entry<String, Integer>> list = new ArrayList<>(mapa.entrySet());
            list.sort(Map.Entry.comparingByValue());

            Map<String, Integer> result = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                result.put(entry.getKey(), entry.getValue());
            }

            //Escrib el mapa
            System.out.println(result);

            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }

