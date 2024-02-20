package dailyChallenge.powerOfTwo;

public class Solution1 {
	
	public boolean isPowerOfTwo (int n) {
		
		if (n==0)
			return false;
		
		Double number = Double.valueOf(n);
		
		double closestPowerOfTwo = (Math.log(number) / (1.0d * Math.log(2.0d)));
		double closestPowerOfTwoFloor = Math.floor(closestPowerOfTwo);
		
		System.out.println(closestPowerOfTwo + " -- " + closestPowerOfTwoFloor);
		
		if (Math.pow(2, closestPowerOfTwoFloor) == n)
			return true;
		return false;
		
//		if (closestPowerOfTwo == closestPowerOfTwoFloor)
//			return true;
//		return false;
		
	}

}
