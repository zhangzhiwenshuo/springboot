package com.zzw.springboot;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("pdzmp","0");
        map.put("dzmpck","3");
        map.put("pdzmp","0");
        map.put("pjsljg","3");
        map.put("jgdz","2");
        map.put("zsljgck","2");
        map.put("p3ddy","3");
        map.put("sjstp","1");
        map.put("scp","1");
        map.put("jstprk","0");
        map.put("rk","0");
        Gson gson = new Gson();
        System.out.println(gson.toJson(map));
    }
}
