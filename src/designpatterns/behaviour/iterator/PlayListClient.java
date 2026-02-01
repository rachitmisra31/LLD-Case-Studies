package designpatterns.behaviour.iterator;

public class PlayListClient {

    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.addSong("shankara");
        playList.addSong("hanumanchalisa- Fav");
        playList.addSong("shiv bhajan- Fav");
        playList.addSong("ram bhajan- Fav");
        playList.addSong("hanuman bhajan");

        PlayListIterator simplePlayList = new SimplePlayListIterator(playList);
        while (simplePlayList.hasNext()) {
            System.out.println("Playing: " + simplePlayList.next());
        }

        PlayListIterator shuffledPlayList = new ShufflePlayList(playList);

        System.out.println("Shuffled PlayList-------------------------------------------------------------------------------------");
        while (shuffledPlayList.hasNext()) {
            System.out.println("Playing: " + shuffledPlayList.next());
        }

        System.out.println("---------------------------Favourite Playlist----------------------------------------------------------------------------------------------------------------");

        PlayListIterator favouritePlayList = new FavouritePlayList(playList);
        while (favouritePlayList.hasNext()) {
            System.out.println("Playing: " + favouritePlayList.next());
        }
    }

}
