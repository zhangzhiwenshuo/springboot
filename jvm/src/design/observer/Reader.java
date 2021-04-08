package design.observer;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Publisher p = (Publisher) o;
        System.out.println("我要订阅" + p.getMagazineName());
    }
}
