class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int high=0;
        int low=0;
        int sum =0;
        int miny= Integer.MAX_VALUE;

        while(high<n){
            sum+=nums[high];

            while(sum>=target){
                int len=high-low+1;
                miny=Math.min(miny,len);
                sum-=nums[low];
                low++;
            }

            high++;
        }

        
        return miny==Integer.MAX_VALUE?0:miny;
    }
}