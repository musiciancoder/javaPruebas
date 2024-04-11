package clasesinternas.clasesanonimas;

 class ClassA {

    public void show() {
        System.out.println("In ClassA show()");
    }

}

class ClassB extends ClassA { //generate ClassB if show() will be overriden more than once.

     @Override
     public void show() {
         System.out.println("In ClassB show()");
     }

}

public class Demo {
    public static void main(String[] args) {
  //      ClassB objectB = new ClassB();
   //     objectB.show();
        ClassA objectA = new ClassA()
            //Instead of defining a new class (ClassB for instance)and instantiate it in order to override show() we can define an anonymous class, which is less verbose
        { //annonymous classes are always internal and lack reserved word "class"
            public void show() {
                System.out.println("In anonymous class show()");
            }
        }; //always close annonymous classes with semicolon
        objectA.show();
    }


}
