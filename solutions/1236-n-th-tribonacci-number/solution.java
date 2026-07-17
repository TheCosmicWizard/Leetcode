class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if (n==0) return n;
        for (int i = 2; i< n; i++){
            int temp1 = b;
            int temp2 = c;
            c = a + b + c;
            b = temp2;
            a = temp1;
        }
        return c;
    }
}
