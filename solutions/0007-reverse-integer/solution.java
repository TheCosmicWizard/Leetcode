class Solution {
    public int reverse(int x) {
        double rev = 0;

        if (x < 0){
            x =x * -1;
        while(x>0){
            int rem = x%10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        rev = rev * -1;
        }else{
            while(x>0){
            int rem = x%10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        }
        if (rev <= -2147483648 || rev >= 2147483647){
            return 0;
        }
        return (int)rev;
    }
}
