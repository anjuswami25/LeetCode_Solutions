class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int count = 0;
        int i = 1;

        while (count < k) {
            if (l < arr.length && arr[l] == i) {
                l++;
            } else {
                count++;
                if (count == k) {
                    return i;
                }
            }
            i++;
        }

        return -1; // यह theoretically कभी नहीं आएगा
    }
}
