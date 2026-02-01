package designpatterns.behaviour.ChainOfResponsibility;

abstract class Approver {
    protected int approvalLimit;

    protected Approver nextApprover;

    // Set the next handler in the chain
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public Approver(int approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public void processLeaveRequest(int leaveDays) {
        if(approvalLimit>=leaveDays){
            approve(leaveDays);
        }
        if(nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDays);
        }
    }

    protected abstract void approve(int leaveDays);
}