package colecciones;

import java.util.*;

public class ContarStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String>list = new ArrayList<>();
        list = Arrays.asList(str.split(" "));
        System.out.println(list.size());

    }
}
