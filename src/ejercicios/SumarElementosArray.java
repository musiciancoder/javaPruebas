package ejercicios;

public class SumarElementosArray {

    public static void main(String[] args) {
        int [] arr = new int[]{2,3,4,1};
        int p=  arr[0];
        int c=0;
        for (int i = 1; i < arr.length; i++) {
           int r= arr[i] + p;
           p= r;
           c++;
           if (c== arr.length-1){
               System.out.println(p);
           }
        }



    }
}
