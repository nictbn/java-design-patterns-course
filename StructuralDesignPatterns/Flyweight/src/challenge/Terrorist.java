package challenge;

public class Terrorist implements Player {
    // intrinsic data
    private final String task;

    // extrinsic data
    private String weapon;

    public Terrorist() {
        this.task = "Plant the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " Task is " + task);
    }
}
