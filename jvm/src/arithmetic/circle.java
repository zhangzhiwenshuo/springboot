package arithmetic;

import java.util.ArrayList;
import java.util.List;

public class circle {

    /**
     * 循环喊数，从1开始数到num的数据退出，取出最后的数字，直到该数组的个数为一
     * @param a
     * @return
     */
    static Integer circleArithmetic(List a){
        int temp = 0;
        int i=0;
        while(a.size()>1){
            temp++;
            i++;
            if(temp==3){
                a.remove(i-1);
                a.forEach(n-> System.out.print(n));
                System.out.println();
                temp=0;
                i--;
            }
            if(i==a.size())
                i=0;
        }
        return (Integer) a.get(0);
    }

    public static void main(String[] args) {
        List  list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(circleArithmetic(list));
    }
}
