package clasesinternas.claseslocalesinternas;

public class InnerLocal {

    private int data=30;//instance variable

    void display(){

        class Local{ //notice local inner classes must not have access modifiers
            void msg(){System.out.println(data);}
        }
        Local l=new Local();
        l.msg();
    }


    public static void main(String args[]){
        InnerLocal obj=new InnerLocal();
        obj.display();
    }
}