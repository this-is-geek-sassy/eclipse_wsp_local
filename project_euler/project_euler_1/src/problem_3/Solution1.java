package problem_3;

public class Solution1 {
	
	private boolean isPrime(long number) {
		int result = (int)Math.sqrt(number);
		
		for (int i=result; i>=2; i--) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	public void solver() {
		
		long number = 600851475143L;
		int result = (int)Math.sqrt(number);
		
//		System.out.println(result);
		for (int i=result; i>=1; i--) {
			if (number % i == 0 && isPrime(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
