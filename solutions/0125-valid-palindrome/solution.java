class Solution {
    public boolean isPalindrome(String s) {
        String a = s.trim();
        String b = a.toLowerCase();
        String c = b.replaceAll("[^a-zA-Z0-9]", "");
        if(c.length() <2 ){
            return true;
        }
        for(int i = 0; i <= (c.length()/2) ; i++){
            if(c.charAt(i) != c.charAt(c.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
