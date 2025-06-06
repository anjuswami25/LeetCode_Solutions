class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int count = 0;

        for (int i = 1; i <= 2000; i++) { 
            if (l < arr.length && arr[l] == i) {
                l++;
            } else {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }

        return -1;
    }
}
