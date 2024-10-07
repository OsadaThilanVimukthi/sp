package spsoultiontest.forloop;

import java.util.ArrayList;
import java.util.List;


public class claculationforloop {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(9);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
 
        System.out.println("sum-> " + sum);
    }
}
