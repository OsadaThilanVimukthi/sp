package problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NonNegative {

	public static void main(String[] args) {
//	int [] i = {50,2,1,9};
//	Arrays.sort(i, Collections.reverseOrder());
//	System.out.printf("Sorted Array :%s",Arrays.toString(i));

        ArrayList<Integer> al = new ArrayList<Integer>(); 
  

        al.add(50); 
        al.add(2); 
        al.add(1); 
        al.add(9); 


        Collections.sort(al, Collections.reverseOrder()); 

        System.out.println( 
           " and Collections.sort() :\n" + al); 	

	}

}
