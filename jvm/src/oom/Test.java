package oom;

public class Test {
   static {
       i = 9;
   }
    private static  int i = 1;
   static {
       i = 20;
   }
    public static void main(String[] args) {
       float f = 3.4F;
       double d = 3;
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);

        Integer a = new Integer(3);
        Integer b = 3;				    // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);		// false 两个引用没有引用同一对象
        System.out.println(a == c);		// true a自动拆箱成int类型再和c比较

        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}
