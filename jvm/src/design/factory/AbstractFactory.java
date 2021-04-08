package design.factory;

public interface AbstractFactory {
    Product  create();
    static void printFactory(){
        System.out.println("print ...");
    }
}
