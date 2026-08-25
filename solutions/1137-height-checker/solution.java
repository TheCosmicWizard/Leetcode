class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone(); 
        
        for(int i = 0; i< arr.length; i++){
            boolean swap = false;
            for(int j = 1; j < arr.length - i;j++){
                if(arr[j -1] > arr[j]){
                    int temp = arr[j -1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        
        int ans = 0;
        for(int idx = 0; idx < arr.length ; idx++){
            if(arr[idx] != heights[idx]){
                ans++;
            }
        }
        return ans;
    }
}
