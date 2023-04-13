package example;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();
}
