package ejercicios.mapas;

//Dado ciertos datos de Nombres y Apellidos de Personas hacer el Palindrome del Apellido y ordenar por nombre alfabetico de Nombre

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PalindromeValuesYOrdenarPorKeys {
    public static void main(String[] args) {
        Map<String,String> personasMapa = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String key;
        String value;
        for (int i = 0; i < n; i++) {
           key = scanner.next();
           value = scanner.nextLine();
           personasMapa.put(key,value);
        }

        for (Map.Entry<String,String> m: personasMapa.entrySet()) {
           value = m.getValue();
           StringBuilder builder = new StringBuilder(value);
           String newValue = builder.reverse().toString().toLowerCase();
           m.setValue(newValue);
        }

        System.out.println(personasMapa);


    }
}
