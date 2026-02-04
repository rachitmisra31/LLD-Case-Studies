package adapter;

public class CarMusic {

    public static void main(String[] args) {
        CassettePlayer sakshiCassette = new CassettePlayer();

        MusicPlayer musicPlayer = new CassetteToMusicAdapter(sakshiCassette);
        musicPlayer.playMusic();
    }
}
