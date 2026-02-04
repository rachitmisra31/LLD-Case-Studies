package designpatterns.behaviour.observer;

public class YoutubeSubscriber implements Subscriber {

    private final String name;
    public YoutubeSubscriber(String subscriberName) {
        this.name = subscriberName;
    }
    @Override
    public void update(String video) {
        System.out.println(name+" is watching the video !---"+video);
    }
}
