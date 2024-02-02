package patronesdiseno.estructurales.adapter;

//this is the adapter, it allows the adaptee to inderectly implements the interface despite the fact that its behaviour does not straightly relate to the methods to be implemented from the interface
public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot theRobot; //instance the adaptee

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
      theRobot.reactToHuman(driverName);
    }
}
