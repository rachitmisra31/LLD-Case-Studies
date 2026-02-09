package casestudies.flipmed.src.main.java.com.flipmed.hospital;

public class Patient {
    private final String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}