package designpatterns.behaviour.visitor;

public class HospitalVisitorDemo {

    public static void main(String[] args) {
        Patient[]  patients ={
                new ChildPatient(), new AdultPatient(), new SeniorPatient()
        };
        Visitor diagonalVisitor = new DiagnosisVisitor();
        Visitor billingVisitor = new DiagnosisVisitor();

        for(Patient patient : patients){
            patient.accept(diagonalVisitor);
            patient.accept(billingVisitor);
        }
    }

}
