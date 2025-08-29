class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        for (i=0; i< nums.length; i++ ){
            for (j=1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    int[] a = {i,j};
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
