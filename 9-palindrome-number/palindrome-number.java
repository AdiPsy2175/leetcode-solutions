class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        } 
        int n = 0 ; 
        int original = x;
        while(x>0){
        int rem  = x % 10;
        n = n*10 + rem;
        x = x/10;
        }
        if(original!=n){
            return false;
        }
        return true;
    }
}
    
