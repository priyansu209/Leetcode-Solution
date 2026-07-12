class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);

        int low=0;
        int high=k-1;
        int res= Integer.MAX_VALUE;

        while(high<nums.length){
            int diff=Math.abs(nums[low]-nums[high]);

            res=Math.min(res, diff);

            high++;
            low++;
        }

        return res;
        
    }
}