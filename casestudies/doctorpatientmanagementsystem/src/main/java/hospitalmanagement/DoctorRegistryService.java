package casestudies.doctorpatientmanagementsystem.src.main.java.hospitalmanagement;

import java.util.*;

public class DoctorRegistryService {
    private final Map<Specialization, List<Doctor>> map = new HashMap<>();

    public void registerDoctor(Doctor d) {
        map.computeIfAbsent(d.getSpecialization(), k -> new ArrayList<>()).add(d);
        System.out.println("Welcome Dr. " + d.getName() + " !!");
    }

    public List<Doctor> getBySpecialization(Specialization s) {
        return map.getOrDefault(s, Collections.emptyList());
    }
}