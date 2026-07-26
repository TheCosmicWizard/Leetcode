class Solution {
    public int[] getConcatenation(int[] nums) {
        int idx = nums.length;
        int[] ans = new int[idx*2];
        
        for(int i =0; i < idx;i++){
            ans[i] = nums[i];
            ans[i+idx] = nums[i];
        }
        return ans;
    }
}
