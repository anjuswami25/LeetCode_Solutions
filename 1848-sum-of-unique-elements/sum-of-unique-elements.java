import java.util.Arrays;

class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i < nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            ans += nums[i];
        }
        return ans;
    }
}
