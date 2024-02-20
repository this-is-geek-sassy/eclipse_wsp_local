package array.two_sum;


// link to the problem: https://leetcode.com/problems/two-sum/description/

public class Solution1 {
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] indices = new int[2];
		
		for(int i=0; i<nums.length-1; i++) {
			for (int j=i+1; j<nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		
		return null;
	}
}
