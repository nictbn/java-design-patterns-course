package challenge;

public class AudioPlayer implements MediaPlayer {

    public static final String MP3 = "mp3";

    @Override
    public void play(String audioType, String fileName) {
        if (MP3.equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
