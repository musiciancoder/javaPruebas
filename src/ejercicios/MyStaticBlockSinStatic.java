package ejercicios;

import java.util.Scanner;

public class MyStaticBlockSinStatic {


    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int B= scan.nextInt();
        int H= scan.nextInt();
        scan.close();

        if(B>0 && H>0){
            int result = B*H;
            System.out.println(result);
        }
        else{
            throw new Exception("Breadth and height must be positive");
        }
    }
}
