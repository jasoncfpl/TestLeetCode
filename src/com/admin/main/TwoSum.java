package com.admin.main;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		long start = System.currentTimeMillis();
		int[] arr = twoSum(nums,target);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(start + " ==" + end);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

//beats 19.13%
public static int[] twoSum(int[] nums, int target) {
        int[] arr = {-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
            		int temp = nums[i] + nums[j];
                    if( temp == target){
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
//beats 19.69%
public static int[] twoSum1(int[] nums, int target) {
      int[] arr = {-1,-1};
      for(int i=0;i<nums.length;i++){
          for(int j = i+1; j<nums.length;j++){
          		int temp = nums[i] + nums[j];
                  if( temp == target){
                       arr[0] = i;
                       arr[1] = j;
                       return arr;
                  }
          }
      }
      return arr;
          
  }
//29.32%
public static int[] twoSum2(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
        for(int j = i+1; j<nums.length;j++){
        		int temp = nums[i] + nums[j];
                if( temp == target){
                     return new int[]{i,j};
                }
        }
    }
	return null;
}
}
