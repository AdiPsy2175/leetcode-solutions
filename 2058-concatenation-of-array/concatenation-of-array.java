class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length; 
        int[] ans = new int[len*2];
        for(int i = 0 ; i<len; i++ ){
            ans[i] = nums[i];
        }
        int k = 0; 
        for(int i = len; i<ans.length; i++){
            ans[i] = nums[k];
            k++;
        }
        return ans;
    }
}