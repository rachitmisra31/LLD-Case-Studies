package abstractfactory;

public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeCarSpecification();
    }
}
