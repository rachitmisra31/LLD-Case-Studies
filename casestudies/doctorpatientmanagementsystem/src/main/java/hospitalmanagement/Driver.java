package casestudies.doctorpatientmanagementsystem.src.main.java.hospitalmanagement;

import java.time.LocalTime;

public class Driver {

    public static void main(String[] args) {
        var drService = new DoctorRegistryService();
        var da = new DoctorAvailabilityService();
        var bs = new BookingService(drService, da);
        Doctor curious = new Doctor("Curious", Specialization.CARDIOLOGIST);
        drService.registerDoctor(curious);
        da.markAvailable(curious, LocalTime.of(9,0));
        da.markAvailable(curious, LocalTime.of(12,0));
        da.markAvailable(curious, LocalTime.of(16,0));

        Doctor dread = new Doctor("Dreadful", Specialization.DERMATOLOGIST);
        drService.registerDoctor(dread);
        da.markAvailable(dread, LocalTime.of(9,0));
        da.markAvailable(dread, LocalTime.of(11,0));
        da.markAvailable(dread, LocalTime.of(13,0));

        System.out.println("showAvailBySpeciality Cardiologist");
        da.getAvailable(Specialization.CARDIOLOGIST)
                .forEach(d -> System.out.println("Dr." + d.getName()));

        Patient pA = new Patient("PatientA");
        System.out.println(bs.book(pA, curious, LocalTime.of(12,0), false));

        System.out.println("After booking:");
        da.getAvailable(Specialization.CARDIOLOGIST)
                .forEach(d -> System.out.println("Dr." + d.getName()));

        // Cancel
        String someId = bs.getByPatient(pA).get(0).getId();
        System.out.println(bs.cancel(someId));
       // You can continue to test waitlist, show appointments etc.
       bs.getByPatient(pA).forEach(b -> System.out.println(b.getId() + ", Dr " + b.getDoctor().getName() + " @" + b.getSlot()) );
    }
}