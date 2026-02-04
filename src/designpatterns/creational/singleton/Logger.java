package designpatterns.creational.singleton;

public class Logger {

    private static Logger logger = null;
    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public void log(String message) {
        System.out.println("Log: "+message);
    }
}
