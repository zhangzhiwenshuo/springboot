package design.factory;

public class ProductA implements Product{
    @Override
    public void sayName() {
        System.out.println(this.getClass().getName()+" "+Thread.currentThread().getName());
    }
}
