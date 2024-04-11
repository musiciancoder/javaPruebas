package comparablevscomparator.hackerrank;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player>{ //Notice this class (which could also have been anonymous whithin Player class) is created for comparison reasons only

    @Override
    public int compare(Player o1, Player o2) {
        return o1.score - o2.score == 0 ? o1.name.compareTo(o2.name) : o2.score - o1.score; //compare by score and if both scores are equal then compare by name
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
