class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false; // Less than 3 elements can't form a triplet
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update first to the smallest value
            } else if (num <= second) {
                second = num; // Update second to the second smallest value
            } else {
                // If num is larger than both first and second, a triplet is found
                return true;
            }
        }

        return false; // No triplet found
    }
}
