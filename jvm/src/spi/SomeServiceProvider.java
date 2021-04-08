package spi;

import api.SomeService;

public class SomeServiceProvider implements SomeService {

    public String getMessage() {
        System.out.println("spi test success");
        return getClass().getName();
    }

}
