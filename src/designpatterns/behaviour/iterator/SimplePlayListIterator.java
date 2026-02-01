package designpatterns.behaviour.iterator;

public class SimplePlayListIterator implements PlayListIterator {

    private int index;
    private PlayList playList;

    public SimplePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < playList.getSongs().size();
    }
}