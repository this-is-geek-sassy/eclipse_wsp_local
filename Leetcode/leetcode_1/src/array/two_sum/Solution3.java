package array.two_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//link to the problem: https://leetcode.com/problems/two-sum/description/
//this is a better solution to the same two sum problem

public class Solution3 {

	public int[] twoSum(int[] nums, int target) {
			
//			ArrayList<Integer> numsArray = new ArrayList<Integer>();
			HashMap<Integer, Integer> originalNums = new HashMap<Integer, Integer>();
			
//			for (int i : nums)
//				numsArray.add(i);
			
			for(int i=0; i<nums.length; i++) {
				
				int wantedElement = target - nums[i];
				
				if (originalNums.containsKey(wantedElement)) {
					int indexOfWantedElement = originalNums.get(wantedElement);
					int[] indices = new int[] {i, indexOfWantedElement};
					return indices;
				}
				originalNums.put(nums[i], i);
			}
			
			return null;
		}
}
