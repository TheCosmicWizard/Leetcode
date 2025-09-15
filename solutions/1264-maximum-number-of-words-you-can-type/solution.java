class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");      // split text into words
        char[] brokenArr = brokenLetters.toCharArray(); // broken letters as char array
        int total = 0;

        for (String word : words) {
            char[] wordArr = word.toCharArray();
            boolean canType = true;

            // check each character in the word
            for (char c : wordArr) {
                for (char b : brokenArr) {
                    if (c == b) {   // word contains broken letter
                        canType = false;
                        break;
                    }
                }
                if (!canType) break; // stop checking further
            }

            if (canType) total++;  // word is typeable
        }

        return total;
    }
}

