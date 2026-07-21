class Solution {
    public int findDuplicate(int[] nums) {
                int i = 0;
        while(i < nums.length){
            int value = nums[i] -1;
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
        for (int idx = 0;idx<nums.length;idx++){
            if(idx != nums[idx]-1){
                return nums[idx];
            }
        }
        return -1;
    }
}
