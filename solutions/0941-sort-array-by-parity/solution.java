class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a = 0;
        int b = nums.length-1;
        while(a < b){
            if(nums[a]%2==0){
                a++;
            }else if(nums[b]%2 !=0){
                b--;
            }else{
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b--; 
            }
        }
        return nums;
    }
}
