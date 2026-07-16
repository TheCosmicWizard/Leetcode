class Solution {
    int num = 0;
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if( n == 0){
            return a;
        }
        if (n==1){
            return b;
        }
        for(int i = 0; i < n -1 ; i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
