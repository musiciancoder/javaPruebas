package mystreams;

import java.util.*;

public class MyFlatMap {

    public static void main(String[] args) {

       List <String> phonenumbers1 = Arrays.asList("455","767676");
       List <String> phonenumbers2 = Arrays.asList("455566","7676767776");
        List <String> phonenumbers3 = Arrays.asList("6565667","7676767778");


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
       Optional<String> stringOptional =  users.stream()
                .map(user->user.getPhonenumber())
                .flatMap(phonenumber->phonenumber.stream())
                .filter(phonenumber->phonenumber.equals("455"))
                .findAny();

        stringOptional.ifPresent(System.out::println);

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
        private List <String> phonenumber;

        public User(String name, Integer age, List<String> phonenumber) {
            this.name = name;
            this.age = age;
            this.phonenumber = phonenumber;
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

        public List<String> getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(List<String> phonenumber) {
            this.phonenumber = phonenumber;
        }
    }
}
