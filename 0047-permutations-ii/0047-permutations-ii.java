class Solution {
    Set<ArrayList<Integer>> set=new HashSet<>();

    public void Permutation(int[] nums,int n, ArrayList<Integer> temp,boolean[]vis){
        if(temp.size()==n){
            set.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<n;i++){
            if(vis[i]==false){
                vis[i]=true;
                temp.add(nums[i]);
                Permutation(nums,n, temp,vis);

                temp.remove(temp.size()-1);
                vis[i]=false;
            }
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
    int n=nums.length;
    ArrayList<Integer> temp=new ArrayList<>();
    boolean[] vis= new boolean[n];
    Permutation(nums,n,temp,vis);

    List<List<Integer>> ans=new ArrayList<>(set);
    return ans;


        
    }
}