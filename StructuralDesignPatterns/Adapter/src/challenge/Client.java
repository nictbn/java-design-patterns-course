package challenge;

public class Client {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "theMusic.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer mp4Adapter = new AdvancedMediaPlayerAdapter(mp4Player);
        mp4Adapter.play("mp4", "alone.mp4");

        AdvancedMediaPlayer vlcPlayer = new Mp4Player();
        MediaPlayer vlcAdapter = new AdvancedMediaPlayerAdapter(vlcPlayer);
        vlcAdapter.play("vlc", "far far away.vlc");

        audioPlayer.play("vlc", "far far away.vlc");
    }
}
