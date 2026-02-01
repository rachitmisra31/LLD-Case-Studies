package designpatterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflePlayList implements PlayListIterator {

    private PlayList playList;
    private int index;
    private ArrayList<String> shuffledPlayList;
    public ShufflePlayList(PlayList playList) {
        this.playList = playList;
        this.shuffledPlayList = new ArrayList<>(playList.getSongs());
        Collections.shuffle(shuffledPlayList);
        this.index = 0;
    }
    @Override
    public String next() {
     return index<shuffledPlayList.size() ? shuffledPlayList.get(index++) : null;
    }

    @Override
    public boolean hasNext() {
        return index<shuffledPlayList.size();
    }
}
