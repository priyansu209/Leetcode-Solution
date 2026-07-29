class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int[] pos=new int[s.length()];
        int n=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
               pos[n]=i;
               n++;
            }
        }
        int [] ans=new int[s.length()];

        for(int i=0;i<s.length();i++){
            int dif=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
               dif = Math.min(dif, Math.abs(i - pos[j]));
            }
            ans[i]=dif;
        }
        return ans;
    }
}