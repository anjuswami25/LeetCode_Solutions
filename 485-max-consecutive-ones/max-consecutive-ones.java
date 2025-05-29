class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                if(cnt>maxi){
                    maxi=cnt;
                }
            }else{
                cnt=0;
            }


            
        }
        int ans=Math.max(cnt,maxi);
        return ans;
        
        
        
    }
}