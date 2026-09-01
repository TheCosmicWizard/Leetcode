class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length < 2){
            return;
        }
        for(int i = 0; i < nums.length; i++){
            boolean swap = false;
            for(int j = 1; j < nums.length; j++){
                if(nums[j-1] == 0){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
