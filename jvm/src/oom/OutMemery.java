package oom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OutMemery {
    public static void main(String[] args) {
        Map<String,Object> concurrentHashMap=new ConcurrentHashMap<String,Object>();
        Map<String,Object> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        int i =0;
        for(;;){
            list.add(String.valueOf(i++));
        }

    }
}
