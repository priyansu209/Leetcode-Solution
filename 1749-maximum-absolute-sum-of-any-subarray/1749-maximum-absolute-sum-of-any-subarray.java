class Solution {
    public int Maxy_sub(int [] nums){
    int bestSum=nums[0];
    int maxy=nums[0];

    for(int i=1;i<nums.length;i++){
        int previous=bestSum+nums[i];
        int cur=nums[i];

        bestSum=Math.max(previous,cur);
        maxy=Math.max(maxy,bestSum);
    }
    return maxy;

    }

    public int Miny_sub(int[] nums){
      int worstSum=nums[0];
      int miny=nums[0];

      for(int i=1;i<nums.length;i++){
        int previous= worstSum+nums[i];
        int cur=nums[i];

        worstSum=Math.min(previous, cur);
        miny=Math.min(miny, worstSum);
      }
      return miny;

    }
    public int maxAbsoluteSum(int[] nums) {
        int a=Math.abs(Maxy_sub(nums));
        int b=Math.abs(Miny_sub( nums));

        return Math.max(a,b);
        
    }
}