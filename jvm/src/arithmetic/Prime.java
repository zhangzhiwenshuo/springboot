package arithmetic;

public class Prime {
    static int primeNumber(){
        int i = 101;
        int num = 0;
        while(i<200){
            int j = i%2;
            if(j==0){
                num++;
            }
            i++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println( primeNumber());
    }
}
