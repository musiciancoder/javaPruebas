package ejercicios;

public class MinimoComun {

    public static void main(String[] args) {
        int num = 24;
        int p=1;
        double res;
        boolean b=true;
        while (p<=num){
         res = num%p;
         if (res==0){
             System.out.println(p);
         }
            p++;
        }


    }
}
