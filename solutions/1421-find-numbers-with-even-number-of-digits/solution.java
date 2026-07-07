class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums ){
            
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    boolean even( int digit){
        
        int length = String.valueOf(digit).length();
        if (length % 2 == 0){
            return true;
        }
        return false;
    }
}
