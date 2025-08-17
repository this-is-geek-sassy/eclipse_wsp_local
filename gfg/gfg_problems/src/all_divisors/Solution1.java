package all_divisors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution1 {
	
	public static void print_divisors(int n) {
		
		System.out.print(1 + " ");
		List<Integer> rest_div_list = new ArrayList<Integer>();
		
		for (int i=2; i<=Math.floor(Math.sqrt(n)); i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				if (i!= (n/i))
					rest_div_list.add(n/i);
			}
		}
		for (int i = rest_div_list.size() - 1; i >= 0; i--) {
			System.out.print(rest_div_list.get(i) + " ");
		}
		if (n!=1)
		    System.out.print(n + " ");
	}

}
