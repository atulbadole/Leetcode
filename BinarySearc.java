package leetcode;

import java.util.Scanner;

public class BinarySearc {
	public static int fn(int arr[],int target) {
		int start = 0;
		int end = arr.length;
		
					
		while (start <= end) {	
			int mid = start+(  end-start) / 2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target =5;
		int ans=fn(arr,target);
		System.out.println(ans);


	}
}
