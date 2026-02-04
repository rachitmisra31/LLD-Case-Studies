package hospitalmanagement;

import java.time.LocalTime;
import java.util.*;

public class DoctorAvailabilityService {
    private static final int START = 9, END = 21;
    private final Map<String, Set<LocalTime>> doctorBusy = new HashMap<>();
    private final Map<Specialization, Map<LocalTime, List<Doctor>>> availability = new HashMap<>();

    public boolean isSlotValid(LocalTime start) {
        return !start.isBefore(LocalTime.of(START, 0))
                && start.plusHours(1).isBefore(LocalTime.of(END + 1, 0));
    }

    public void markAvailable(Doctor d, LocalTime start) {
        if (!isSlotValid(start)) {
            System.out.println("Sorry Dr. " + d.getName() + " slots are 60 mins only");
            return;
        }
        // set up availability
        availability
                .computeIfAbsent(d.getSpecialization(), k -> new HashMap<>())
                .computeIfAbsent(start, k -> new ArrayList<>())
                .add(d);
        System.out.println("Done Doc!");
    }

    public List<Doctor> getAvailable(Specialization s) {
        Map<LocalTime, List<Doctor>> dayMap = availability.getOrDefault(s, Collections.emptyMap());
        List<Doctor> flat = new ArrayList<>();
        for (LocalTime slot : new TreeSet<>(dayMap.keySet())) {
            for (Doctor d : dayMap.get(slot))
                flat.add(d);
        }
        return flat;
    }

    public boolean isDoctorBusy(String doctorId, LocalTime slot) {
        Set<LocalTime> busy = doctorBusy.getOrDefault(doctorId, Collections.emptySet());
        return busy.contains(slot);
    }

    public void bookSlot(Doctor d, LocalTime slot) {
        if (isDoctorBusy(d.getId(), slot)) return;
        doctorBusy.computeIfAbsent(d.getId(), k -> new HashSet<>()).add(slot);
    }

    public void cancelSlot(Doctor d, LocalTime slot) {
        Set<LocalTime> b = doctorBusy.get(d.getId());
        if (b != null) b.remove(slot);
    }
}