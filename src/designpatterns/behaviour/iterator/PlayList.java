package designpatterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {

    private ArrayList<String> songs = new ArrayList<>();

    public void addSong(String song){
        songs.add(song);
    }


    public PlayListIterator iterator(PlayListIterator playListIterator) {
        return playListIterator;
    }

    public List<String> getSongs(){
        return Collections.unmodifiableList(songs);
    }
}
/**
 * playList->[Gerua,HanumanChalis]
 */