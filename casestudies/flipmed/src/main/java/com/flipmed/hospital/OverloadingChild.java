package casestudies.flipmed.src.main.java.com.flipmed.hospital;

public class OverloadingChild extends Overloadding{

    @Override
    public void sum(int a, int b) {
        super.sum(a, b);
        System.out.println("Child class called");
    }
}
