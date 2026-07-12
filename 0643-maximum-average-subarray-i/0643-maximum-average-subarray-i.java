class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int low = 0;
        int high = k - 1;

        double sum = 0;

        for (int i = low; i <= high; i++) {
            sum += nums[i];
        }

        double avg = sum / k;
        double res = avg;

        while (high < nums.length) {

            low++;
            high++;

            if (high == nums.length) {
                break;
            }

            sum -= nums[low - 1];
            sum += nums[high];

            avg = sum / k;
            res = Math.max(res, avg);
        }

        return res;
    }
}