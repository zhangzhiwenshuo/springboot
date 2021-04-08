package design.factory;

public class FactoryB implements AbstractFactory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
