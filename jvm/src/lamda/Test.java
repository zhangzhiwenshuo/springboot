package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {

        List<String> names1 = new ArrayList<String>();
        names1.add("Google");
        names1.add("Runoob");
        names1.add("Taobao");
        names1.add("Baidu");
        names1.add("Sina");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google");
        names2.add("Runoob");
        names2.add("Taobao");
        names2.add("Baidu");
        names2.add("Sina");
        names1.forEach(n -> System.out.println(n));

        Consumer<Integer> consumer = x -> {
            int a = x + 2;
            System.out.println(a);// 12
            System.out.println(a + "_");// 12_
        };
        consumer.accept(10);

        BinaryOperator<Integer> binary = (x, y) -> x + y;
        System.out.println(binary.apply(1, 2));// 3

        new Thread(() -> System.out.println("task running !")).start();

        Supplier<String> supplier =  ()-> "supplier get test!";
        System.out.println(supplier.get());

        Function<String,Long> fun = str -> Long.valueOf(str);
        System.out.println(fun.apply("300")+2);

        Predicate<Integer> predicate = age -> age > 18;
        Predicate<String> predicate1 = str -> str != null;
        System.out.println(predicate.test(12));
        System.out.println(predicate1.test("sdf"));

        String str = "sdfsadfasdf00";
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("fs"));
        StringBuilder sbr = new StringBuilder(str);
        System.out.println(sbr.reverse());



    }
}
