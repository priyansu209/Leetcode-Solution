// unique characte =2;
class Solution {
    public int totalFruit(int[] fruits) {
        int high=0;
        int low=0;
        int n= fruits.length;

        HashMap<Integer,Integer> mp=new HashMap<>();

        int maxy=Integer.MIN_VALUE;
        
        for(int i=high;i<n;i++){
            int front=fruits[i];
            mp.put(front,mp.getOrDefault(front,0)+1);

            while(mp.size()>2){
                int back=fruits[low];
                mp.put(back, mp.get(back)-1);

                if(mp.get(back)==0){
                    mp.remove(back);
                }
                low++;
            }

           
                int sum=0;

                for(int freq:mp.values()){
                    sum+=freq;
                }
                maxy=Math.max(maxy, sum);
            
        }

        return maxy==Integer.MIN_VALUE?-1:maxy;

        
    }
}