package designpatterns.behaviour.visitor;

public class BIllingVisitor implements Visitor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Billing for child patients!! ");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Billing for adults!");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Billing for seniors!");
    }
}
