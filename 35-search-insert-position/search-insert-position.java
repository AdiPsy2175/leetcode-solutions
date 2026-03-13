class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
            else{
               if(nums[i]<target){
                count++;
               }
               if(nums[i]>target){
                count+=0;
               }
            }
        }
        return count;       
    }
}