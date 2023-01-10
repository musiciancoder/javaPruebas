package patronesdiseno.estructurales.adapter;

public class TestEnemyAttackers {
    public static void main(String[] args) {

        EnemyAttacker myTank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("the robot");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The enemy tank");
        myTank.assignDriver("Frank");
        myTank.driveForward();
        myTank.fireWeapon();

        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("John");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
