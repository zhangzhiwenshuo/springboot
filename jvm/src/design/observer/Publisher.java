package design.observer;

import java.util.Observable;

public class Publisher extends Observable {

    private String magazineName;


    public String getMagazineName() {
        return magazineName;
    }

    public void publish(String magazineName) {
        this.magazineName = magazineName;
        setChanged();
        notifyObservers(this);
    }

}
