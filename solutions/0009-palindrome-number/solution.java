class Solution {
    public boolean isPalindrome(int x) {
        char[] myArray = Integer.toString(x).toCharArray();
        int i;
        int y=0;
        for (i=0; i< myArray.length/2; i++){
            if (myArray[i]!=myArray[myArray.length-1-i]){
                return false; 
            }
        }
        return true;
    }
}
