package designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public interface YoutubeChannel {


     void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();
}
