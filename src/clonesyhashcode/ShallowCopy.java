package clonesyhashcode;

public class ShallowCopy { //copias dependientes unas de otras
}

class Address {
    String city;
    String country;

    Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

class MyPerson implements Cloneable {
    String name;
    Address address;


    MyPerson(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Tokyo", "Japan");
        MyPerson person1 = new MyPerson("Alice", address);
        MyPerson person2 = (MyPerson) person1.clone();

        System.out.println(person1.address.city);  // Output: Tokyo
        person2.address.city = "Osaka";
        System.out.println(person1.address.city);  // Output: Osaka (shared reference)
    }
}

