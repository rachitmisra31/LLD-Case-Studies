package casestudies.doctorpatientmanagementsystem.src.main.java.hospitalmanagement;
import java.util.UUID;

public class Patient {
    private final String id;
    private final String name;

    public Patient(String name) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
