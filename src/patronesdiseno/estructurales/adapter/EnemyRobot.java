package patronesdiseno.estructurales.adapter;

import java.util.Random;

public class EnemyRobot {// This is the adaptee, note there is no link to the methods from Enemy Attacker, so we need to create an adapter (EnemyRobotAdapter) so it can perform tasks of EnemyAttacker, just as Enemy Tank does
    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(10) +1;
        System.out.println("enemy robot causes " + attackDamage + "Damage with its hands");
    }

    public void walkForward(){
        int movement =generator.nextInt(5) +1;
        System.out.println("enemy robot walks forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("enemy robot tramps on " + driverName);
    }



}
