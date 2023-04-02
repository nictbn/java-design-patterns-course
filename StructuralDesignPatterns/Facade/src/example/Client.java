package example;

public class Client {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
                projector, lights, screen, popper);
        homeTheater.watchMovie("The Shawshank Redemption");
        homeTheater.endMovie();
    }
}
