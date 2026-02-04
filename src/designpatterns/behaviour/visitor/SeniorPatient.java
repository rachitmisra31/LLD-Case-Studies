package designpatterns.behaviour.visitor;

public class SeniorPatient implements Patient{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
