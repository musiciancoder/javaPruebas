package mystreams;

import java.util.*;
import java.util.stream.Collectors;

public class MyFlatMap {

    public static void main(String[] args) {

       List <String> phonenumbers1 = Arrays.asList("455","767676");
       List <String> phonenumbers2 = Arrays.asList("455566","7676767776");
       List <String> phonenumbers3 = Arrays.asList("455","7676767778");


        List <User> users = new ArrayList<>();
        users.add(new User("Andres",40,phonenumbers1));
        users.add(new User("Claudio",30,phonenumbers2));
        users.add(new User("Edgaro",60,phonenumbers3));

        //SINTAXIS 1
/*      Optional<String> stringOptional = users.stream()
                .map(user->user.getPhonenumber().stream())//la lista de numeros de telefono pasa a stream
              //flatMap es una operacion intermedia,que se usa por ejemplo cuando hay listas dentro de otras listas, como en este caso
              //el stream de numeros de teléfono es filtrado antes de convertir otro usuario a stream
                        .flatMap(stringStream->stringStream.filter(phoneNo->phoneNo.equals("455")))
                .findAny();

if (stringOptional.isPresent())
{
    System.out.println(stringOptional.get());
}*/

        //SINTAXIS 2 (recomendada)
       List<String> listOfUsers =  users.stream()
                .map(user->user.getPhonenumbers())//phoneNumbers es lista de listas de numeros
                .peek(phonenumbers-> System.out.println("list of phonenumbers: "+phonenumbers))
                .flatMap(phonenumber->phonenumber.stream())//phonenumber es lista de numero
               .peek(p -> System.out.println("phonenumber: " + p))
                .filter(phonenumber->phonenumber.equals("455")).collect(Collectors.toList());

        System.out.println(listOfUsers);

        //SINTAXIS 3
     /*   Optional<String> stringOptional =  users.stream()
                .map(User::getPhonenumber)
                .flatMap(Collection::stream)
                .filter(phonenumber->phonenumber.equals("455"))
                .findAny();

        stringOptional.ifPresent(System.out::println);*/


    }

    static class User {
        private String name;
        private Integer age;
        private List <String> phonenumbers;

        public User(String name, Integer age, List<String> phonenumbers) {
            this.name = name;
            this.age = age;
            this.phonenumbers = phonenumbers;
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

        public List<String> getPhonenumbers() {
            return phonenumbers;
        }

        public void setPhonenumbers(List<String> phonenumbers) {
            this.phonenumbers = phonenumbers;
        }
    }
}
