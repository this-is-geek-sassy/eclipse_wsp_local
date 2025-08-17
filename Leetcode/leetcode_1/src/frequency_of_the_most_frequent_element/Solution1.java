package frequency_of_the_most_frequent_element;

// problem link: https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//import java.util.Iterator;

public class Solution1 {
	public int maxFrequency(int[] nums, int k) {
        
//		for (int i : nums) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			Integer val = map.get(nums[i]);
			if (val != null) {
				map.put(nums[i], ++val);
			}
			else {
				map.put(nums[i], 1);
			}
		}
		
//		List<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		var entries = new ArrayList<>(map.entrySet());
//		System.out.println(entries);
		
		Collections.sort(entries, (a, b) -> {
			int cmp = a.getValue().compareTo(b.getValue());
			if (cmp==0) {
				return a.getKey().compareTo(b.getKey());
			}
			return cmp;
		}); // By value
//		System.out.println(entries);
		
		Integer ans = entries.get(entries.size()-1).getKey();
//		System.out.println(ans);
		return ans;
    }
}
