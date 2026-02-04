package designpatterns.behaviour.iterator;

import designpatterns.behaviour.iterator.PlayList;
import designpatterns.behaviour.iterator.PlayListIterator;

public class FavouritePlayList implements PlayListIterator {
    private PlayList playlist;
    private int index;
    public FavouritePlayList(PlayList playlist) {
        this.playlist = playlist;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        // Only return the next song if it's marked as a favorite
        while (index < playlist.getSongs().size()) {
            if (playlist.getSongs().get(index).contains(
                    "Fav")) { // Mark favorites with 'Fav' in name
                return true;
            }
            index++;
        }
        return false;
    }
    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}