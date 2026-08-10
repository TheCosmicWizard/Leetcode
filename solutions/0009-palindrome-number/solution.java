class Solution {
    public boolean isPalindrome(int x) {
        char[] myArray = Integer.toString(x).toCharArray();
        int i;
        int y=0;
        int n=myArray.length;
        for (i=0; i< n/2; i++){
            if (myArray[i]!=myArray[n-1-i]){
                return false; 
            }
        }
        return true;
    }
}
