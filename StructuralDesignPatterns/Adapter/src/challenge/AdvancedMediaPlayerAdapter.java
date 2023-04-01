package challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.loadFilename(fileName);
        advancedMusicPlayer.listen();
    }
}
