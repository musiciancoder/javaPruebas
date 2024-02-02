package clonesyhashcode;

public class EqualsIgual {
    public static void main(String[] args) {
        Man man1 = new Man("Edgardo", 72);
        Man man2 = new Man("Edgardo", 72);
        if (man1 == man2) { //por defecto, si no sobrescribimos hashcode ni equals, el comportamiento de equals es el mismo de ==
            System.out.println("man1==man2");
        } else System.out.println("man1!==man2 ");
        if (man1.equals(man2)) {
            System.out.println("man1 equals man2");
        } else System.out.println("man1 NOT equals man2");


        Woman w1 = new Woman("Mireya", 70);
        Woman w2 = new Woman("Mireya", 70);
        if (w1 == w1) {
            System.out.println("w1==w2");
        } else System.out.println("w1!==w2");
        if (w1.equals(w2)) {
            System.out.println("w1 equals w2");
        } else System.out.println("w1 NOT equals w2");


        String s1 = new String("abd"); //NO RECOMENDABLE, pq aunque el equals es true, el signo igual da falso!! Este mismo comportamiento presentan los wrapper clases y enums
        String s2 = new String("abd"); //NO RECOMENDABLE, pq aunque el equals es true, el signo igual da falso!!!

        if (s1==s2){
            System.out.println("s1==s2");
        } else System.out.println("s1!==s2");

        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        }else System.out.println("s1 NOT equals s2");

        String s3 = "def";
        String s4 = "def";

        if (s3==s4){
            System.out.println("s3==s4");
        } else System.out.println("s3!==s4");

        if (s3.equals(s4)) {
            System.out.println("s3 equals s4");
        }else System.out.println("s3 NOT equals s4");
    }

}

class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Woman {
    private String name;


    public Woman(String name, int age) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) { //Sobrescribiendo solo Hashcode pero no equals da w1==w2, pero w1 NOT equals w2
        if (obj instanceof Woman) {
            Woman woman = (Woman) obj;
            if (this.name == woman.name) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }








}


