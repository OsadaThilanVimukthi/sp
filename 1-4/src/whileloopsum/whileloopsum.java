package whileloopsum;

import java.util.ArrayList;
import java.util.List;

public class whileloopsum {

	public static void main(String[] args) {
		
	       List<Integer> list = new ArrayList<Integer>();
	        int sum = 0;
	        int count = 0;
	 
	        // add some elements in list
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	 
	        // execute while loop until the count less than the
	        // list size.
	        while (list.size() > count) {
	 
	            // add list values with sum variable one-by-one.
	            sum += list.get(count);
	 
	            // increment in count variable
	            count++;
	        }
	 
	        // print sum variable
	        System.out.println(" The sum of list is: " + sum);

	}

}
