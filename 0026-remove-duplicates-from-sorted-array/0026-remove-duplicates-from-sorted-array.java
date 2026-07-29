class Solution {
    public int removeDuplicates(int[] nums) {
        int insert=0;
        int scan=1;

        int k=1;

        while(scan<nums.length){
          if(nums[scan]!=nums[scan-1]){
            k++;
            nums[insert+1]=nums[scan];
            insert++;
          }
          scan++;

        }
        return k;
        
    }
}