package clonesyhashcode;

public class DeepCopy {
}

class Address2 {
    String city;
    String country;

    Address2(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Deep copy constructor
    public Address2(Address2 address) {
        this.city = address.city;
        this.country = address.country;
    }
}

class MyPerson2 implements Cloneable {
    String name;
    Address2 address;

    MyPerson2(String name, Address2 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() {
        return new MyPerson2(this.name, new Address2(this.address));  // Deep copy
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address2 address = new Address2("Tokyo", "Japan");
        MyPerson2 person1 = new MyPerson2("Alice", address);
        MyPerson2 person2 = (MyPerson2) person1.clone();

        System.out.println(person1.address.city);  // Output: Tokyo
        person2.address.city = "Osaka";
        System.out.println(person1.address.city);  // Output: Tokyo (independent copy)
    }
}

