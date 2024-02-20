package array.two_dim.richest_customer_wealth;

// Link to the problem: https://leetcode.com/problems/richest-customer-wealth/description/

public class Solution1 {
	
	public int maximumWealth(int[][] accounts) {
		
		int maxwealth = -1;
		for(int i=0; i < accounts.length; i++)
		{
//			System.out.println(accounts[i].length);
			int netWealth = 0;
			for (int j=0; j < accounts[i].length; j++) {
//				System.out.print(accounts[i][j] + " ");
				netWealth += accounts[i][j];
			}
			if (netWealth > maxwealth)
				maxwealth = netWealth;
			System.out.println(maxwealth);
		}
		return maxwealth;
	}

}
