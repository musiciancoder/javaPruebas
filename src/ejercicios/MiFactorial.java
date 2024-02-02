package ejercicios;

public class MiFactorial {
    public static void main(String[] args) {
        int num = 9;
        int p=1;
        int res=1;
        while (p<=num){
            res=res*p;
            p++;
        }
        System.out.println(res);
    }
}
