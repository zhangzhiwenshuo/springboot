package oom;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i = 3;
        Integer j = 150;
        System.out.println(i);
        System.out.println(j);
        new Outer();
    }
}

class Outer {

    class Inner {
        String name="zhangsan";
        String getName(){
            return this.name;
        }
    }

    public static void foo() {

    }
    static {
        System.out.println(new Outer().new Inner().getName());
    }

    public void bar() { new Inner(); }
    byte b;
    String str ;
    char c;
    double d;
    long l;
    float f;
    int i;
    short s;
    boolean bl;
    {
        switch (b){

        }
    }

   public static void main(String[] args) {
//        new Inner();
    }
}

