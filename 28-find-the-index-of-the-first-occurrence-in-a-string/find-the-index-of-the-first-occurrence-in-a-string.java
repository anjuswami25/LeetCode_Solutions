// class Solution {
//     public int strStr(String haystack, String needle) {
//         return (haystack.indexOf(needle));
//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {
        int k = needle.length();
        if (k == 0) return 0;
        
        for (int i = 0; i <= haystack.length() - k; i++) {
            if (haystack.substring(i, i + k).equals(needle)) return i;
        }
        
        return -1;
    }
}