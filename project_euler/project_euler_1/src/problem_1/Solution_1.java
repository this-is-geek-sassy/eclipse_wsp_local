package problem_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public class Solution_1 {
	public void solver() {
		// TODO Auto-generated method stub
		int limit = 1000;
		int divisor_1 = 3, divisor_2 = 5;
		
		int numberOfFirstKind = Math.floorDiv(limit, divisor_1);
		int numberOfSecondKind = Math.floorDiv(limit, divisor_2);
		
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		
		for (int i = 1; i <= numberOfFirstKind; i++) {
			one.add(divisor_1*i);
		}
		for (int i = 1; i <= numberOfSecondKind; i++) {
			two.add(divisor_2*i);
		}
		
//		for (Iterator<Integer> iterator = two.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//		}
		Set<Integer> union = new HashSet<Integer>(one);
		union.addAll(two);
		
		int sum = union.stream()
						.reduce(0, (a, b) -> a+b);
		Optional<Integer> max = union.stream()
						.max(Integer::compareTo);
		
		System.out.println(sum - 1000);
	}
}
