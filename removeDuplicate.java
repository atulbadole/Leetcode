package leetcode;
//26
import java.util.Scanner;

public class removeDuplicate {
	
	    public void removeduplicates(int[] nums) {
	        int arr = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
	                continue;
	            }
	            nums[arr] = nums[i];
	            arr++;
	        }
	        
	        	System.out.println(arr);
	        
	    }
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		removeDuplicate obj=new removeDuplicate();
		obj.removeduplicates(nums);

	}
}
