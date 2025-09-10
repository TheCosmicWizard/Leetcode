class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1,b = n-1;
        for (int i=0;i<n/2;i++){
            if (!Integer.toString(a).contains("0") && !Integer.toString(b).contains("0")) {
                break;
            }else {
                a++;
                b--;
            }
        }
        return new int[]{a, b};
    }
}
