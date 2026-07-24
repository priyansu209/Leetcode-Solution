class Solution {

    public int maxSum(int[] nums) {
        int current = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        return best;
    }

    public int minSum(int[] nums) {
        int current = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.min(nums[i], current + nums[i]);
            best = Math.min(best, current);
        }

        return best;
    }

    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;
        for (int x : nums)
            total += x;

        int maxNormal = maxSum(nums);
        int min = minSum(nums);

        // All elements are negative
        if (maxNormal < 0)
            return maxNormal;

        return Math.max(maxNormal, total - min);
    }
}