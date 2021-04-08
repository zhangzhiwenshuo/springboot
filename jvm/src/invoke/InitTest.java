package invoke;

public class InitTest {
    public static void main(String[] args) {
        Son son = new Son();
        Son son1 = new Son();
        Son son2 = new Son();
        System.out.println(Son.class.getClassLoader());
        System.out.println(Son.class.getClassLoader().getParent());
        System.out.println(Son.class.getClassLoader().getParent().getParent());
    }
}

class Father{
    private int a;
    {
        System.out.println("father init");
    }
    static {
        System.out.println("static father init");
    }
}

class Son extends Father{
    private int b;
    {
        System.out.println("son init");
    }
    static {
        System.out.println("static son init");
    }
}