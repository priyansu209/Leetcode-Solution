class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void Combo(int n, int i, List<Integer> temp,
                      int target, int[] candidates, int sum) {

        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (i == n || sum > target) {
            return;
        }

        // Include current element
        temp.add(candidates[i]);
        Combo(n, i, temp, target, candidates, sum + candidates[i]);
        temp.remove(temp.size() - 1);

        // Exclude current element
        Combo(n, i + 1, temp, target, candidates, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Combo(candidates.length, 0, temp, target, candidates, 0);
        return ans;
    }
}