class Solution {
    public boolean isPowerOfFour(double n) {
      if(n==1){
        return true;
      }
      else if(n<1){
        return false;
      }
    //   double m=Math.ceil(n/4);
      return isPowerOfFour(n/4);
    }
}