class Solution {
    public void moveZeroes(int[] nums) {
         int insert_pos=0;

         for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insert_pos]=nums[i];
                insert_pos++;
            }
         }

         while(insert_pos<nums.length){
            nums[insert_pos]=0;
            insert_pos++;
         }
         
    }
}