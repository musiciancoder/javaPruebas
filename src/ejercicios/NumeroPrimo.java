package ejercicios;

public class NumeroPrimo {
    public static void main(String[] args) {
        int num = 19;
        int p=2;
        int res;
        while (p<num){
            res = num%p;
            if (res==0){
                System.out.println(num + " no es primo");
                return;
            }
            p++;

        }
        System.out.println(num + " es primo");
    }
}
