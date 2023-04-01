package challenge;

public class Professor implements Faculty {
    private final String name;
    private final String position;
    private final int officeNumber;

    public Professor(String name, String position, int officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public String getDetails() {
        return name + " is a " + position;
    }
}
