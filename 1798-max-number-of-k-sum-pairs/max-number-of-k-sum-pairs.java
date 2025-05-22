class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length - 1;
        int count = 0;

        while(i < n){
            if(nums[i] + nums[n] == k) {
                count++;
                i++;
                n--;
            } else if (nums[i] + nums[n] > k) {
                n--;
            } else {
                i++;
            }
        }
        return count;
    }
}