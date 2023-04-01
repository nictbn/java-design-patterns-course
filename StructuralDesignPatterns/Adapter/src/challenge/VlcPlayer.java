package challenge;

public class VlcPlayer implements AdvancedMediaPlayer {
    String myFile;

    @Override
    public void loadFilename(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + myFile);
    }
}
