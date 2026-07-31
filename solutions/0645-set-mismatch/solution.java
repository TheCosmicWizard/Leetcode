class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int value = nums[i] -1;
            if(i == value || value + 1 == nums[value]){
                i++;
            } else{
                int temp = nums[value];
                nums[value] = nums[i];
                nums[i] = temp;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j+1  != nums[j]){
                return new int[]{nums[j], j+1};
            }
        }
        return new int[]{-1};
    }
}
