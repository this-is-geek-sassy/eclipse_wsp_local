package gcd;

public class Solution2 {

	public int gcd (int n1, int n2) {
		
		int min = (n1 <= n2)? n1: n2;
		int max = (n1 >= n2)? n1: n2;
		
//		System.out.println(min);
//		System.out.println(max);
		
		
//		int p = (n1 <= n2)? int min = n1 : int min = n2;
		
		int r = max % min;
		if (r == 0) {
			return min;
		}
		
//		System.out.println(r);
		
		return gcd(min, r);
	}
}
