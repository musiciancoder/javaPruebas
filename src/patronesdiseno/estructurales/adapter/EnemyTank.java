package patronesdiseno.estructurales.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{ //this class do not need an adaper, since methods from EnemyAttacker are well suited.

    Random generator = new Random();
    @Override
    public void fireWeapon() {

        int attackDamage= generator.nextInt(10) +1;
        System.out.println("enemy attack does " + attackDamage + " damage.");

    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5)+1;
        System.out.println("enemy tank moves "  +  movement + "spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " id driving the tank");


    }
}
