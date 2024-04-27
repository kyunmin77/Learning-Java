package Collection_Framework;

import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {

		for(int i =0; i<5;i++) {
			Set set = new HashSet();
			
			while(set.size() < 6) { //for (int i = 0; set.size() < 6; i++)
				int num = (int) (Math.random() * 45) + 1;
				set.add(num); // set.add(new Integer(num));
			}
			
			List list = new LinkedList(set);
			Collections.sort(list);
			System.out.println(list);
		}
	}

}
