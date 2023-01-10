package mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {
    public static void main(String[] args) {
        List<String> personas = Arrays.asList("Andres", "Edgardo", "Claudio"); //creo la lista
        List<User> users = personas.stream() // paso la lista de strings a un stream de String
                .map(User::new)  //lo que hago es pasarla a un stream de User mediante el uso de map. Esto es equivalente a User user= new User(persona), es decir Andres, Edgardo, etc. se estan pasando por parametro al constructor;
                .collect(Collectors.toList()); //la paso a una lista de User
        users.forEach(user -> System.out.println(user.toString())); //a diferencia de map, forEach no convierte tipos, ya que es un void. Ademas es una operacion terminal y no intermedia como map.
    }

    static class User {
        private String name;
        private String address;

/*        public User(String name, String address) {
            this.name = name;
            this.address = address;
        }*/

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

}
