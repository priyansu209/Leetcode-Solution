class Solution {
    public int maxSubArray(int[] nums) {
         int best=nums[0];
         int ans=nums[0];

         for(int i=1;i<nums.length;i++){
            int previous=best+nums[i];
            int cur=nums[i];

            best=Math.max(previous, cur);
            ans=Math.max(best, ans);
         }
        return ans;
    }
}