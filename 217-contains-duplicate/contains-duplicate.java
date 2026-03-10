class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i: nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> count: freq.entrySet()){
            if(count.getValue()>1){
                return true;
            }
        }
        return false;
    }
}