package design.factory;

public class FactoryA implements AbstractFactory{
    @Override
    public Product create() {
        return new ProductA();
    }
}
