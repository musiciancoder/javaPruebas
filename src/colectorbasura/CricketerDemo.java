package colectorbasura;

public class CricketerDemo {

    public static void main(String[] args) {

        Cricketer c = new Cricketer();
        c=null;//1.By assigning a null

        Cricketer c1= new Cricketer();
        Cricketer c2= new Cricketer();
        c1=c2;//2.By assigning reference of another object

        new Cricketer();//3.By annonymous object

        System.gc(); //to print "Object is destroyed"

    }
}

class Cricketer{
    Cricketer(){
        System.out.println("Object is created");
    }

    @Override
    protected void finalize() throws Throwable { //this method runs each time a GC is executed. Finalize is deprecated from v.9 on
        super.finalize();
        System.out.println("Object is destroyed");
    }
}
