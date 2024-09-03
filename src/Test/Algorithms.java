package Test;

import java.util.Arrays;

public class Algorithms {

	public static void main(String[] args) {
		int[] nums = {1,2,3,5,6,7,8,8};
		int[] nums1 = {1,0,5,3,8};
		missingarray(nums);
		duplicate(nums);
		movezeros(nums1);
		
	}
	
	public static void missingarray(int[] nums) {
		int n=0;
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++)
		{
			if(i!=nums[i-1])
			{
				n=i;
				break;
			}
		}
		System.out.println(n);
	}
	
	public static void duplicate(int[] nums) {
		int n=0;
		Arrays.sort(nums);
		for(int i=0;i<=nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				n=nums[i];
				break;
			}
		}
		System.out.println(n);
	}
	
	public static void movezeros(int[] nums) {
		int temp = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0) {
				nums[temp]=nums[i];
				temp++;
			}
		}
		 for (int i = temp; i < nums.length; i++) {
	            nums[i] = 0;
	        }
		System.out.println(Arrays.toString(nums));
	}
	
	
}
