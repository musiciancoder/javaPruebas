package ejercicios.series;

public class Series2 { //31 34 32 35 33 36 34 ... suma tres resta dos, hasta llegar a 100

    public static void main(String[] args) {
        int num = 31;
        int n = 100;
        int dos = 2;
        int tres = 3;
        System.out.print(num + " ");
        while (num<=n){

            num = num + tres;
            if (num>100) return;
            System.out.print(num + " ");
            num = num -dos;
            System.out.print(num + " ");
        }
    }

}
