package com.admin.main;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3,2,4,7,6,1,8,9};
		int target = 12;
		long start = System.currentTimeMillis();
		int[] arr = twoSum(nums,target);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(start + " ==" + end);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
public static int[] twoSum(int[] nums, int target) {
        
        int firstValue,secValue;
        int[] arr = {-1,-1};
        for(int i=0;i<nums.length;i++){
            firstValue = nums[i];
            for(int j = 0; j<nums.length;j++){
//            	if(i == j){
//            		continue;
//            	}
                secValue = nums[j];
                int temp = firstValue + secValue;
                if( temp == target && i!= j){
                     arr[0] = i;
                     arr[1] = j;
                     break;
                }
            }
            if(arr[0]!=-1 && arr[1] !=-1){
            	break;
            }
        }
        return arr;
            
    }
}
