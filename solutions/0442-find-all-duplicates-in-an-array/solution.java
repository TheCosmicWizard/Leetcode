class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < nums.length){
            int value = nums[i]-1;
            if(value == nums[value]-1){
                i++;
            }else if(i != value){
                int temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
            }else{
                i++;
            }
        }
        for(int idx = 0; idx < nums.length;idx++){
            if(idx != nums[idx] -1 ){
                ans.add(nums[idx]);
            }
        }
        return ans;
    }
}
