class Solution {
    public int minInsertions(String s) {
        int req = 0; // how many ')' we need
        int ins = 0; // how many insertions we need

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                req += 2;
                if (req % 2 != 0) {
                    // we have odd requirement, insert one ')'
                    ins++;
                    req--;
                }
            } else { // current char is ')'
                req--;
                if (req < 0) {
                    ins++; // insert one '('
                    req = 1;
                }
            }
        }

        return ins + req;
    }
}
