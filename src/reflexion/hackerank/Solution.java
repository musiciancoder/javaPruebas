package reflexion.hackerank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Student student = new Student();
       // student.setId("1234");
        Method[] studentMethods = student.getClass().getDeclaredMethods();
        List<String> list = Arrays.stream(studentMethods).map(s->s.toString()).collect(Collectors.toList());
        list.replaceAll(st->st.replace("java.lang.String",""));
        System.out.println(list);
        List<Integer> positions = list.stream().map(i->i.lastIndexOf('.')).toList();
        int c =0;
        String str2;
        List<String> newList = new ArrayList<>();
        for (String str: list ) {
             str2 =   str.substring(1 + positions.get(c));
             newList.add(str2);
             c++;
        }

        Collections.sort(newList);
        for (String str: newList ) {
            System.out.println(str);
        }
    }
}
