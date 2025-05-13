class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;
        
        // Merge characters alternately from both strings
        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }
        
        // If there are remaining characters in word1
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }
        
        // If there are remaining characters in word2
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }
        
        return mergedString.toString();
    }
}
