class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        for(int i = 0 ; i <  len ;i++){
            boolean found = false;
            for(int j = 0 ; j < len ;j++){
                if(j != i && nums[i] == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                return nums[i];
            }
        }
        return -1;
    }
}
