package designpatterns.creational.singleton;

public class LoggerClient {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("debug level logs");
    }
}
