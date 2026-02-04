package adapter;

public class CassetteToMusicAdapter implements MusicPlayer{

    private CassettePlayer sakshiCassettePlayer;

    public CassetteToMusicAdapter(CassettePlayer sakshiCassettePlayer) {
        this.sakshiCassettePlayer = sakshiCassettePlayer;
    }

    @Override
    public void playMusic() {
        sakshiCassettePlayer.playCassette();
    }
}
