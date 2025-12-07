class Solution {
public:
    int countOdds(int low, int high) {
        // Number of integers between low and high inclusive
        int total = high - low + 1;
        
        // Half of them will be odd, but if both are odd, we add 1 more
        return total / 2 + (low % 2 && high % 2);
    }
};
