package ejercicios;

import java.util.*;

public class JuegoHackerrank {




        public static boolean canWin(int leap, int[] game) {
            // Return true if you can win the game; otherwise, return false.
            int position = 0;
            if (position + leap > game.length -1) {
                return true;
            } else {
                while (game[position + 1] == 0) {
                    position++;
                    if (position + leap > game.length -1) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }


                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
        }
    }

