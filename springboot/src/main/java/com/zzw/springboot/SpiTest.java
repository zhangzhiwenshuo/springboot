package com.zzw.springboot;

import com.zzw.springboot.api.SomeService;
import org.junit.runner.RunWith;

import java.util.ServiceLoader;

//@SpringBootTest
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class SpiTest {
    static ServiceLoader<SomeService> services = ServiceLoader.load(SomeService.class);

    public static void main(String[] args) {
        for(SomeService someService:services){
            System.out.println(someService.getMessage());
        }

    }
}
