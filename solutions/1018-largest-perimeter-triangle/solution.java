class Solution {
    public int largestPerimeter(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++ ){
            boolean swap = false;
            for(int j = 1; j< nums.length; j++){
                if(nums[j] < nums[j-1]){
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
        int maxArea = 0;
        for(int m = 0; m < nums.length -2; m++){
            if(nums[m] + nums[m+1] > nums[m+2]){
                maxArea = nums[m] + nums[m+1] + nums[m+2];
            }
        }
        return maxArea;
    }
}
