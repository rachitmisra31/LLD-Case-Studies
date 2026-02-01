package solid.liskov;

public class WritableFile extends ReadableFile implements Writable {

    @Override
    public void write() {
        System.out.println("Write to file");
    }
}
