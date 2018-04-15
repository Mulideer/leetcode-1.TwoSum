class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] sum =new int [2];
        for( int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                if( nums[i]+nums[j] == target )
                    sum[0]=nums[i];
                    sum[1]=nums[j];
                   return sum;
              }
            }
       return sum; 
        }        
               
}
