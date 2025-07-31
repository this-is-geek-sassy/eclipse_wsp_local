package gcd;

public class Solution1 {
	
	public int gcd (int n1, int n2) {
		
int min = (n1 <= n2)? n1 : n2;
		
		for (int i=min; i>=2; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				return i;
			}
		}
		return 1;
	}

}
