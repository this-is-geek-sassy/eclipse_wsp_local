package right_triangle_1;

public class Solution1 {
	
	void printTriangle(int n) {
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
