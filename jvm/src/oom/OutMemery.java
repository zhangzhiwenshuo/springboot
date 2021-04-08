package oom;

import java.util.ArrayList;
import java.util.List;

public class OutMemery {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i =0;
        for(;;){
            list.add(String.valueOf(i++));
        }

    }
}
