import java.util.Arrays;

class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 0; i < nums.length; i += 2) {
            // Compare every pair of two elements
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }

        return true; // All pairs matched
    }
}
