package mystreams;

import java.util.Arrays;
import java.util.List;

public class MyMapToInt {

    public static void main(String[] args) {
        List<String> personas = Arrays.asList("Andres", "Edgardo", "Claudio"); //creo la lista



        int sumaEdades = personas.stream()// paso la lista de string a un stream
                .mapToInt(persona ->new
                        User(persona).getAge()) //obtengo la edad de cada una de las personas
                .sum();//las sumo todas
        System.out.println("Suma edades: " +sumaEdades);

    }
    static class User {
        private String name;
        private Integer age =30;



        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}

