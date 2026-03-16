class Solution {
    public double myPow(double x, int n) {
        double power = Math.pow(x,n);
        return power;

        // // base case 
        // if(n==0){
        //     return 1;
        // }
        // //kaam
        // int fnm1 = myPow(x,n-1);
        // int fn = x*fnm1;
        // return fn;
    }
}  