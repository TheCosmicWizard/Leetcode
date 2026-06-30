
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1 ; i >= 0; i--){
           if(digits[i] < 9){
                digits[i]=1+digits[i];
                return digits; 
            }
            if(digits[i] == 9){
                if(i == 0){
                int[] arr = new int[n+1];
                arr[0] = 1;
                return arr;
            }
                digits[i] = 0;
            }
            
        }
        return digits;
    }
}
