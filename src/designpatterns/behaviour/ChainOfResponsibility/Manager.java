package designpatterns.behaviour.ChainOfResponsibility;

class Manager extends Approver {

    public Manager() {
        super(7);
    }

    @Override
    protected void approve(int leaveDays) {
        System.out.println("Manager approved the leave of "+leaveDays+" days");
    }
}
