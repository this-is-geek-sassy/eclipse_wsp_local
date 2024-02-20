package array.two_sum;

import java.util.ArrayList;
import java.util.Arrays;

//link to the problem: https://leetcode.com/problems/two-sum/description/
// this is a better solution to the same two sum problem

public class Solution2 {
	
	public int[] twoSum(int[] nums, int target) {
		
		ArrayList<Integer> numsArray = new ArrayList<Integer>();
		for (int i : nums)
			numsArray.add(i);
		
//		Arrays.sort(nums);
//		int i = 0;
		for(int i=0; i<nums.length; i++) {
			int wantedElement = target - nums[i];
			int indexOfWantedElement = numsArray.indexOf(wantedElement);
			System.out.println(nums[i] + " " + i + " " + wantedElement + " " + indexOfWantedElement);
			if (indexOfWantedElement >= 0 && (i!= indexOfWantedElement)) {
				int[] indices = new int[] {i, indexOfWantedElement};
				return indices;
			}
//			i++;
		}
		
		return null;
	}

}
