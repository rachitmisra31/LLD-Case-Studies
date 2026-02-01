package designpatterns.behaviour.ChainOfResponsibility;

class Supervisor extends Approver {

    public Supervisor() {
        super(3);
    }

    @Override
    protected void approve(int leaveDays) {
        System.out.println("Supervisor approved the leave of "+leaveDays+" days");
    }
}