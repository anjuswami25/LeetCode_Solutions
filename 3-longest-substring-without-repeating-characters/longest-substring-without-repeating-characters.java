class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int max = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
                count--; 
            }

            set.add(s.charAt(i));
            count++;  
            max = Math.max(max, count);
        }

        return max;
    }
}
