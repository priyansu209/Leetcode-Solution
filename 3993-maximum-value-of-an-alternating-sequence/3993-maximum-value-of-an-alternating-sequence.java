class Solution {
    public long maximumValue(int n, int s, int m) {
        long ans=0;
   

         if(n==1){
              return (long) s;
         }

        long  no_maxy_elmnt=n/2;

        ans= (long) s+ no_maxy_elmnt*m-(no_maxy_elmnt-1);

        return ans;
        
        
    }
}