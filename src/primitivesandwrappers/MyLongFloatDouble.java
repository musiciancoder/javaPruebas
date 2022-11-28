package primitivesandwrappers;

public class MyLongFloatDouble {
    /*En long y float no preocuparse por el significado de L o F, la notación es asi.*/
    private final static int myInt = 1;
    private final static long myLong= 2;
    private final static long myLongTwo= 2L; //la L es optativa para long con pocos digitos
    private final static long myLongThree=2222222222L; //sin la L da error para long con muchos digitos
    /*
    Float is generally used when speed is more important than accuracy. While our day-to-day programs do not involve large computations, in practical applications, this difference becomes quite significant. Also, the float is generally used when the number of decimal digits required is known. Double is used for almost all other cases: especially when precision is highly important. Keep in mind that Java enforces the use of double as the default data type for dealing with floating-point numbers.

     */
    private final static float myFloat=  1.1F; //sin la F da error
    private final static double myDoble= 1.1;
    private final static double myDobleTwo=1.0000000000000000000000000000000000000000001;

    public static void main(String[] args) {
        //para multiplicar int pot long debe hacerse un casting para pasar a int o bien guardarlo en un long
        int myRes1= (int) (myInt*myLong);
        System.out.println("myRes1: " + myRes1);
        long myRes2 =myInt*myLong;
        System.out.println("myRes2: " + myRes2);
        long myRes3 =myInt*myLongTwo;
        System.out.println("myRes3: " + myRes3);
        long myRes4= myInt*myLongThree;
        System.out.println("myRes4: " + myRes4);
        float myRes5 =myInt*myFloat;
        System.out.println("myRes5: " + myRes5);
        double myRes6=myInt*myDoble;
        System.out.println("myRes6: " + myRes6);
         int myRes7= (int) (myInt*myDoble); //lo aproxima a int mas cercano.
        System.out.println("myRes7: " + myRes7);


    }

}
