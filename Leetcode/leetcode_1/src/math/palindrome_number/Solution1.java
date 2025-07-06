package math.palindrome_number;

// link to problem: https://leetcode.com/problems/palindrome-number/description/

public class Solution1 {
	
	public boolean isPalindrome (String number) {

		if (number.length() <= 1)
			return true;
		else if (number.charAt(0) == number.charAt(number.length() - 1)) {
			String newNumber = number.substring(1, number.length() - 1);
			
//			System.out.println("newNumber: " + newNumber);
			if (newNumber.length() == 0)
				return true;
			
//			int newNumberInteger = Integer.parseInt(newNumber);
//			System.out.println("newNumberInteger: " + newNumberInteger);
			
			return this.isPalindrome(newNumber);
		}
		
		return false;
	}
	public boolean isPalindrome(int x) {
		
		String number = String.valueOf(x);
		return this.isPalindrome(number);
	}
}
