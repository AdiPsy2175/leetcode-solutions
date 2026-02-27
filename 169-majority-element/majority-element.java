class Solution {
    public int majorityElement(int[] nums) {
        int start = 0 ;
        int end = nums.length - 1;
        int half = nums.length/2;
        if(start==end){
            return nums[start];
        }
        while (start<end){
            for (int i= start; i<nums.length; i++){
                int count = 1;
                for( int j= end; j>start; j--){
                        if(nums[j]==nums[i]){
                            count ++;
                        }                       
                }
                if(count> half){
                    return nums[i];
                }
            }
        }
        return -1 ;
    }
}