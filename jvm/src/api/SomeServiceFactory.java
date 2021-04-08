package api;

import sun.misc.Service;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class SomeServiceFactory {
    private SomeServiceFactory() {
    }
    public static SomeService getSomeServiceInstance() {
        Iterator it = Service.providers(SomeService.class);
        if (it.hasNext()) {
            return (SomeService) it.next();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        getSomeServiceInstance();
    }
}
