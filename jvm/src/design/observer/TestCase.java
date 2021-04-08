package design.observer;

import org.junit.Test;

public class TestCase {
    @Test
    public void register() {
        Publisher publisher = new Publisher();
        Reader reader = new Reader();
        publisher.addObserver(reader);
        publisher.publish("Kent.Kuan的技术空间");
    }
}
