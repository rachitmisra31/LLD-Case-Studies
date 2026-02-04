package abstractfactory;

public class NorthAmericaCarSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local government");
    }
}
