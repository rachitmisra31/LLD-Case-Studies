package designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel {

    private String video;
    private List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> {
            subscriber.update(video);
        });
    }

    public void uploadVideo(String video) {
        this.video = video;
        notifySubscribers();
    }
}