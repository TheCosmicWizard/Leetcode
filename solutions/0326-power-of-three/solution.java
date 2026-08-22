class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 2 || n < 1){
            return false;
        }
        if(n == 1){
            return true;
        }else if(n % 3 == 0){
            return isPowerOfThree(n/3);
        }else{
            return false;
        }
    }
}
