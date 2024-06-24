package colecciones.copiasdelistas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CopiasConStreams {

    public static void main(String[] args) {
        List<String>list= new ArrayList<>();
        list.add("Fender");
        list.add("Gibson");
        List<String> copy = list.stream().collect(Collectors.toList()); //shallow copy
        list.add("PRS");
        System.out.println(copy);

    }
}
