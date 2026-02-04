package solid.liskov;

public class FileClient {

    static void readAny(ReadableFile readableFile){
      readableFile.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WritableFile writableFile = new WritableFile();
        writableFile.write();


        readAny(readableFile);
        readAny(writableFile);
    }
}