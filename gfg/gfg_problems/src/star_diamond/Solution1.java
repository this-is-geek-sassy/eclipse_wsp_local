package star_diamond;

public class Solution1 {
	
	public void nStarDiamond (int n) {
		
		int lastTerm = 1;
		for (int i=2; i<=n; i++) {
			lastTerm += 2;
		}
//		System.out.println(lastTerm);
		
		int lastIndex = lastTerm-1;
		int left = lastIndex/2, right = left;
		
//		System.out.println(left);
//		System.out.println(right);
		
		while (left>=0 && right <= lastIndex) {
			
			for (int i=0; i<left; i++) {
				System.out.print(" ");
			}
			for (int i=left; i<=right; i++) {
				System.out.print("*");
			}
//			for (int i=right+1; i<=lastIndex; i++) {
//				System.out.print(" ");
//			}
			System.out.println();
			left--;
			right++;
		}
//		System.out.println(left);
//		System.out.println(right);
		left++; right--;
//		left++; right--;
		
		while (left <= right) {
			// do the reverse (or same?) thing
			for (int i=0; i<left; i++) {
				System.out.print(" ");
			}
			for (int i=left; i<=right; i++) {
				System.out.print("*");
			}
//			for (int i=right+1; i<=lastIndex; i++) {
//				System.out.print(" ");
//			}
			System.out.println();
			
			
			left++;
			right--;
		}
	}
}
