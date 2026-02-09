package casestudies.doctorpatientmanagementsystem.src.main.java.hospitalmanagement;

import java.util.UUID;

public class Doctor {
    private final String id;
    private final String name;
    private final Specialization specialization;

    public Doctor(String name, Specialization specialization) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.name = name;
        this.specialization = specialization;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Specialization getSpecialization() { return specialization; }
}