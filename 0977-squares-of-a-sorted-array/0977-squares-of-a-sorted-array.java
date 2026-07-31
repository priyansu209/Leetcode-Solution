class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int k=nums.length-1;

        int left=0;
        int right=nums.length-1;

        while(left<=right){
          if(nums[left]*nums[left]>nums[right]*nums[right]){
            res[k]= nums[left]*nums[left];
            k--;
            left++;
          }else{
            res[k]=nums[right]*nums[right];
            k--;
            right--;

          }

        }
        return res;
        
    }
}