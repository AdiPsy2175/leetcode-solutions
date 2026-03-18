class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int j =0; j<s.length(); j++){
            sb.append(s.charAt(j));
        }
         int rp = sb.length()-1;
         while(sb.charAt(rp)==' ')
         {
            rp--;
         }
         int ei = rp;
         int count=0;
         for(int i = ei; i>=0; i--){
            if(sb.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
         }
        return count;       
         
    }
}