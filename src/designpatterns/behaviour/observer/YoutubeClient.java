package designpatterns.behaviour.observer;

public class YoutubeClient {

    public static void main(String[] args) {
        YoutubeChannelImpl youtubeChannel = new YoutubeChannelImpl();
        Subscriber youtubeSubscriber = new YoutubeSubscriber("Rachit");
        Subscriber youtubeSubscriber2 = new YoutubeSubscriber("Sagar");
        youtubeChannel.addSubscriber(youtubeSubscriber);
        youtubeChannel.addSubscriber(youtubeSubscriber2);

        youtubeChannel.uploadVideo("https://www.youtube.com/watch?v=Rachit");

        youtubeChannel.uploadVideo("https://www.youtube.com/watch?v=Sagar");

        youtubeChannel.removeSubscriber(youtubeSubscriber);

        youtubeChannel.uploadVideo("Multithreading tutorial" +
                "");
    }
}
