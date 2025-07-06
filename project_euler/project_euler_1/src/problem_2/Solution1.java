package problem_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution1 {
	public void solver() {
		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(1);
		fibonacci.add(2);
		
		int sum = fibonacci.stream().reduce(0, (a,b) -> a+b);
		int lastValue = fibonacci.get(fibonacci.size() - 1);
		long sum_even = 2;
		
		while (lastValue < 4000000) {
			Integer nextNumber = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
//			sum += nextNumber;
			if (nextNumber >= 4000000)
				break;
			if (nextNumber % 2 == 0)
				sum_even += nextNumber;
			fibonacci.add(nextNumber);
			lastValue = nextNumber;
		}
		
//		for (Iterator iterator = fibonacci.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//		}
		System.out.println(sum_even);
	}
}
