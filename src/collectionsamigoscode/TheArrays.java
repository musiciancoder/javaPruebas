package collectionsamigoscode;

/*
* Arrays are:
- Fixed in size
- Fast for data retrievals
- Compact memory usage if size is know
- Delete operation very hard
-2D arrays*/

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0]="purple";
        colors[1]="blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2]="yellow";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("");

        for (int i= colors.length-1;i>=0;i--){
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        for (String color:colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(e-> System.out.println(e));

        //Arrays. //varios metodos

        //2D

        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';

            }

        }

        char[][] boardTwo = new char[][]{
                new char[]{'1','-','-'},
                new char[]{'1','-','-'},
                new char[]{'1','-','-'}

        };
        System.out.println(Arrays.deepToString(boardTwo));

        System.out.println("");

        board[0][0]='0';
        board[1][0]='0';
        board[2][0]='0';
        System.out.println(Arrays.deepToString(board));
    }
}
