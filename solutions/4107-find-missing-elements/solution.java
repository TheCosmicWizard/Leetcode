class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length -1 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        for(int i = 0; i< nums.length-1 ;i++){
            if(nums[i] != nums[i+1]-1){
                int idx = nums[i+1] - nums[i];
                for (int x = 0 ; x < idx - 1;x++){
                    ans.add(nums[i]+x+1);
                } 
            }
        }
        return ans;
    }
}
