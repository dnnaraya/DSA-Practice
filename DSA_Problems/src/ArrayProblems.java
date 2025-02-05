import java.util.Arrays;

public class ArrayProblems {
	
	//Problem1: Get HCF of two numbers
	
	public int getHCF(int x, int y) {
		int minVal = Math.min(x, y);
		
		if( x % minVal == 0 && y % minVal == 0) {
			return minVal;
		}else {
			for(int i = minVal/2; i>=2; i--) {
				
				if(x%i==0 && y%i==0) {
					return i;
				}
			}
		}

		return 1;
	}
	
	
	//Problem2: Two sum - Given int arr & target sum 
	// - return indices of two numbers such that they add up to target
	
	public int[] twoSum(int[] arr, int targetSum) {
		
		int[] indices = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==targetSum) {
					indices[0]=i;
					indices[1]=j;
				}
			}
		}
		
		return indices;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		ArrayProblems ap = new ArrayProblems();
		
		//GetHCF of two numbers:
		
		int x = 9;
		int y = 21;
		int hcf = ap.getHCF(x,y);
		System.out.println("The HCF of the numbers " + x + " and " + y + " is : " + hcf);

		//TwoSum
		
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] twoSumindices = ap.twoSum(nums,target);
		System.out.println("Indices of the number which sums to target " + target + " is : " + Arrays.toString(twoSumindices));
		
	}

}
