package array.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

// Link to the problem: https://leetcode.com/problems/fizz-buzz/description/

public class Solution1 {
	
	public List<String> fizzBuzz(int n) {
	
		List<String> answer = new ArrayList<String>();
		
		// System.out.println(answer.size());
		
		for (int i = 1; i <= n; i++) {
			if (i%15 == 0)
				answer.add("FizzBuzz");
			else if (i%3 == 0)
				answer.add("Fizz");
			else if (i%5 == 0)
				answer.add("Buzz");
			else
				answer.add(Integer.valueOf(i).toString());
			// System.out.println("test");
//			System.out.println(answer.get(i-1));
		}
		
		return answer;
	}
}
