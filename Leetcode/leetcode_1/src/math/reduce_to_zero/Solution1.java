package math.reduce_to_zero;

// Link to the problem: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/


public class Solution1 {

    public int numberOfSteps(int num) {
        
//    	return num >> 1;
    	int num1 = num, steps = 0;
    	
    	while (num1 != 0){
	    	if (num1%2 == 1) {
	    		num1--;
	    		steps++;
	    	}
	    	else {
	    		num1/=2;
	    		steps++;
	    	}
    	}
    	return steps;
    }
    
}
