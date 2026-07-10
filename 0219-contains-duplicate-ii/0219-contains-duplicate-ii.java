class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> st = new HashSet<>();

        int i = 0;
        int j = 0;
        int n = nums.length;

        while (j < n) {

            if (Math.abs(i - j) > k) {
                st.remove(nums[i]);
                i++;
            }

            if (st.contains(nums[j])) {
                return true;
            }

            st.add(nums[j]);
            j++;
        }

        return false;
    }
}