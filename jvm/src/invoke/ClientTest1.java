package invoke;

public class ClientTest1 {
    private int a;
    public int getA(){
        return this.a;
    }

    public static void main(String[] args) {
//        ClientTest1 clientTest1 = new ClientTest1();
//        System.out.println(clientTest1.a);
        String xml = "<RequestingCount>6</RequestingCount>";
        final String prefix = "<RequestingCount>";
        final String suffix = "</RequestingCount>";
        boolean b = xml.startsWith(prefix);
        boolean b1 = xml.contains(prefix);
        System.out.println(b1);
        System.out.println(b);
        System.out.println(xml.indexOf(prefix));
        System.out.println(prefix.length());
        System.out.println(xml.indexOf(suffix));
        xml = xml.substring(xml.indexOf(prefix) + prefix.length(), xml.indexOf(suffix));
        System.out.println(xml);
        String sdf = "2102231024141360T1";
        System.out.println(sdf.length());
    }
}
