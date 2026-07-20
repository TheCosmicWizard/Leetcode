class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>(); 
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if (nums[correct] - 1  == correct){
                i++;
            }else if (i !=correct){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length;j++){
            if (j != nums[j]-1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
