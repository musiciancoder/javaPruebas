package excepciones;

import java.lang.reflect.Array;

public class ExcepcionConThrows {

    //Aca queremos que se caiga en 5


    
    public static void main(String[] args) throws Exception {
        Integer [] array = new Integer[] {1,2,3,4,5,6};
        for (Integer variable: array) {
            System.out.println(variable);

            if (variable==5){
                throw new MiExcepcion();
            }
        }
    }




}
