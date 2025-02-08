import java.util.Arrays;
import java.util.HashSet;

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
	
	
	
	//Problem 3 - Contains Duplicates
	//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	
	//Solution1
	public boolean containDuplicates1(int[] nums) {
		
		boolean isDuplicate = false;
		
		Arrays.sort(nums);
		
		int i = 0;
		while(i < nums.length-1) {
			if(nums[i]==nums[i+1]) {
				isDuplicate = true;
				break;
			}
			i++;
		}
		
		return isDuplicate;
	}
	//Solution2
	public boolean containDuplicates2(int[] nums) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		ArrayProblems ap = new ArrayProblems();
		
		//GetHCF of two numbers:
		System.out.println("\n\nProblem 1 :: HCF of numbers ");
		int x = 9;
		int y = 21;
		int hcf = ap.getHCF(x,y);
		System.out.println("The HCF of the numbers " + x + " and " + y + " is : " + hcf);

		//TwoSum
		System.out.println("\n\nProblem 2 :: Two Sum ");
		int[] nums1 = {2,7,11,15};
		int target = 9;
		int[] twoSumindices = ap.twoSum(nums1,target);
		System.out.println("Indices of the number which sums to target " + target + " is : " + Arrays.toString(twoSumindices));
		
		//Problem 3 => ContainsDuplicates
		System.out.println("\n\nProblem 3 :: Contain Duplicates ");
		int[] nums2 = {1,1,1,3,3,4,3,2,4,2};
		boolean isContainDuplicate = ap.containDuplicates1(nums2);
		System.out.println("Is the array " + Arrays.toString(nums2) + " contains Duplicate:: " + isContainDuplicate);
				
		int[] nums3 = {1,2,3,4};
		boolean isContainDuplicate2 = ap.containDuplicates2(nums3);
		System.out.println("Is the array " + Arrays.toString(nums3) + " contains Duplicate:: " + isContainDuplicate2);
		
	}

}
