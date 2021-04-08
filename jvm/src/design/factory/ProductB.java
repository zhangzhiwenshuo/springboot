package design.factory;

public class ProductB implements Product {
    @Override
    public void sayName() {
        System.out.println(this.getClass().getName()+" "+Thread.currentThread().getName());
    }
}
