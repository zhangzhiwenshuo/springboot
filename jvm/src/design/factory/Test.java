package design.factory;

public class Test {
    public static void main(String[] args) {
         AbstractFactory factoryA = new FactoryA();
         AbstractFactory factoryB = new FactoryB();
         Product product = factoryA.create();
         Product productB = factoryB.create();
         productB.sayName();
         product.sayName();
    }
}
