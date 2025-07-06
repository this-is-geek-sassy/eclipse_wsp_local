package math.palindrome_number;

public class Solution2 {

	public boolean isPalindrome(int x) {
		
		if (x < 0)
			return false;
		int y = x;
		int invertedNumber = 0;
		while (x != 0) {
//			int firstDigit = x / 10;
//			int secondDigit = x % 10;
//			if (firstDigit != secondDigit)
//				return false;
			int lastDigit = x % 10;
			invertedNumber *= 10;
			invertedNumber += lastDigit;
			x /= 10;
		}
//		System.out.println(invertedNumber);
		
		if (y == invertedNumber)
			return true;
		return false;
	}
}
