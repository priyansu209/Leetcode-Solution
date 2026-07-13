class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int ans=-1;
        for(int key:map.keySet()){
            if(map.get(key)==key){
                ans=key;
            }
        }
        return ans;
    }
}