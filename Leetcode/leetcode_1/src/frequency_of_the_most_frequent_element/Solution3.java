package frequency_of_the_most_frequent_element;

import java.util.Arrays;

public class Solution3 {
	public int maxFrequency(int[] nums, int k) {
        
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		return 0;
    }

}
