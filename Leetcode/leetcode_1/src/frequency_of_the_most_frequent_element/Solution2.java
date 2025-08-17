package frequency_of_the_most_frequent_element;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// problem link: https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/

public class Solution2 {
	
	public ArrayList<Map.Entry<Integer, Integer>> provider (int[] nums) {

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
		var entries = new ArrayList<>(map.entrySet());
		
		Collections.sort(entries, (a, b) -> {
			int cmp = a.getValue().compareTo(b.getValue());
			if (cmp==0) {
				return a.getKey().compareTo(b.getKey());
			}
			return cmp;
		}); // By value
		return entries;
	}
	
	public int maxFrequency(int[] nums, int k) {
		ArrayList<Map.Entry<Integer, Integer>> entry = provider(nums);
        
        System.out.println(entry);
        
        for (int i = entry.size() - 2; i>=0; i--) {
        	Map.Entry<Integer, Integer> largestElement = entry.get(entry.size()-1);
        	
        	System.out.println("k_before_op="+k);
        	int val = entry.get(i).getKey();
        	int freq = entry.get(i).getValue();
        	int abs_diff = Math.abs(largestElement.getKey() - val);
        	int min_transferable = Math.floorDiv(k, abs_diff);
        	
        	if ((min_transferable > 0) && (min_transferable <= freq)) {
        		k -= (min_transferable*abs_diff);
        		if (k <= 0)
        			break;
        		Map.Entry<Integer, Integer> newLargestElem = new SimpleEntry(largestElement.getKey(), largestElement.getValue()+min_transferable);
        		entry.set(entry.size()-1, newLargestElem);
        		entry.set(i, new SimpleEntry(val, freq-min_transferable));
        	} 
        	else if (min_transferable > 0) {
        		k -= (freq*abs_diff);
        		if (k <= 0)
        			break;
        		Map.Entry<Integer, Integer> newLargestElem = new SimpleEntry(largestElement.getKey(), largestElement.getValue()+freq);
        		entry.set(entry.size()-1, newLargestElem);
        		entry.set(i, new SimpleEntry(val, freq-freq));
        	}
//        	System.out.println("abs_diff="+abs_diff);
//        	System.out.println("Min_transferable="+min_transferable);
        	System.out.println("k="+k);
//        	System.out.println(entry);
//        	System.out.println("----------");
        	if (k <= 0)
        		break;
		}
        System.out.println(entry);
        int ans = entry.get(entry.size()-1).getValue();
        return ans;
    }

}
