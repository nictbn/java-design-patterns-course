package challenge;

public class CounterTerrorist implements Player {
    // intrinsic data
    private final String task;

    // extrinsic data
    private String weapon;

    public CounterTerrorist() {
        this.task = "Defuse the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter-Terrorist with weapon " + weapon + " Task is " + task);
    }
}
