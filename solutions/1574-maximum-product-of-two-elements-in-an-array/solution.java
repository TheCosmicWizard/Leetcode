class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int maxSecond = 0;
        int n = nums.length;
        int idx = 0;
        for(int i = 0; i < n; i++){
            if (nums[i] > max){
                maxSecond = max;
                max = nums[i];
            }else if(nums[i] > maxSecond){
                maxSecond = nums[i];
            }
        }
        return (max - 1)*(maxSecond - 1);
    }
}
