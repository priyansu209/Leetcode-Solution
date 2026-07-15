class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;

        for(int n:nums){
            if(n==0){
                count++;
            }
        }

        ArrayList<Integer> nonZero=new ArrayList<>();

        for(int n: nums){
            if(n!=0){
                nonZero.add(n);
            }
        }
        int n= nonZero.size();
        int last=0;
        for(int i=0;i<n;i++){
            nums[i]=nonZero.get(i);
            last=i;
        }


        for(int j=last+1;j<nums.length;j++){
            nums[j]=0;
        }
        
    }
}