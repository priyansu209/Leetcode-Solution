class Solution {
    public int arrangeCoins(int n) {
        int k=0;
        for(int i=1;i<=n;i++){
            int stair=i;
            if(stair<=n){
                k++;
                n=n-i;
            }
        }
        return k;
        
    }
}