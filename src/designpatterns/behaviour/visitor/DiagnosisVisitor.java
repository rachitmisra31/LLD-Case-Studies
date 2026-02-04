package designpatterns.behaviour.visitor;

public class DiagnosisVisitor implements Visitor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Doctor visiting child patient!");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Doctor visiting adult patient!");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Doctor visiting senior patient!");
    }
}
