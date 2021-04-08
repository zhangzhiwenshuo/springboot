package com.zzw.springboot.spi;

import com.zzw.springboot.api.SomeService;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceProvider implements SomeService {

    public String getMessage() {
        System.out.println("spi test success");
        return getClass().getName();
    }

}
