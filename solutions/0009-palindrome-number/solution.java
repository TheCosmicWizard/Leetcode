class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String[] digits = String.valueOf(x).split("");
        int len = digits.length;
        int i = 0;
        while(i < len/2){
            if (digits[i].equals(digits[len-1-i])){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}
