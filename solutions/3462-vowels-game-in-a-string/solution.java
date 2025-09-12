class Solution {
    public boolean doesAliceWin(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                return true;
            }
        }
        return false;
    }
}
