package dailyChallenge.missingNumber;

public class Solution1 {
	
	public int[] nums = {9,6,4,2,3,5,7,0,1};
	
//	public int missingNumber(int[] nums) {
//        
//    }
	
	
	
	public static void shuffling (int[] nums, int i) {
		
		int entry = nums[i];
		int temp = nums[entry];
		nums[entry] = entry;
		shuffling(nums, temp);
		System.out.println(nums);
	}

	public Solution1() {
		super();
		// TODO Auto-generated constructor stub
		shuffling(nums, 0);
	}

}
