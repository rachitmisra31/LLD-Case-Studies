package designpatterns.creational.factory.goodcode;

public class BIke implements Vehicle{
    @Override
    public void start() {
        System.out.println("BIke start");
    }
    @Override
    public void stop() {
        System.out.println("BIke stop");
    }
}
