package invoke;

public class ClientTest {
    private static int A = 1;
    static {
        A = 10;
    }

    public static void main(String[] args) {
        System.out.println(A);
    }
}
