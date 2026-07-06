class Solution {
    public int Solve(int i,int j,int[] nums){
        if(i>j){
            return 0;
        }

        if(i==j){
            return nums[i];
        }

        int start= nums[i] +Math.min(Solve(i+2,j,nums), Solve(i+1,j-1,nums));

        int end= nums[j]+ Math.min(Solve(i,j-2,nums), Solve(i+1,j-1,nums));

        return Math.max(start,end);
    }
    public boolean predictTheWinner(int[] nums) {
    int p1=Solve(0,nums.length-1,nums);
    int total= 0;

    for(int i=0;i<nums.length;i++){
        total+=nums[i];
    }
    
    int p2=total-p1;

    if(p1>=p2){
        return true;
    }
    return false;
   
        
    }
}