package prime;

public class Solution1 {
	
	public boolean isPrime(int n) {
		
		if (n < 2)
			return false;
		int k = (int) Math.floor(Math.sqrt(n));
//		System.out.println(k);
		
		for (int i = 2; i<=k; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
