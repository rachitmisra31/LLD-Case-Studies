package designpatterns.behaviour.ChainOfResponsibility;

class Director extends Approver {


    public Director() {
        super(14);
    }

    @Override
    protected void approve(int leaveDays) {
        System.out.println("Director approved the leave of "+leaveDays+" days");
    }
}