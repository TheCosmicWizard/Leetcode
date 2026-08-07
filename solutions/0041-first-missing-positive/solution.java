class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i < nums.length){
            int value = nums[i] - 1;
            if(nums[i]>0 && nums[i]<nums.length){
                if(value +1== nums[value]){
                    i++;
                }else if(nums[i] != i +1){
                    int temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
                }
            }else{
                i++;
            }
        }
        for(int idx = 0;idx < nums.length; idx++){
            if(nums[idx] != idx+1){
                return idx+1;
            }
        }
        return nums.length +1;
    }
}
