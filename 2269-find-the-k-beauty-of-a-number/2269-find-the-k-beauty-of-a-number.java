class Solution {
    public int divisorSubstrings(int num, int k) {

        // Convert int -> int[]
        String s = String.valueOf(num);
        int n = s.length();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.charAt(i) - '0';
        }

        int low = 0;
        int high = k - 1;
        int count = 0;

        while (high < n) {
            int digit = 0;

            for (int i = low; i <= high; i++) {
                digit = digit * 10 + nums[i];
            }

            if (digit != 0 && num % digit == 0) {
                count++;
            }

            low++;
            high++;
        }

        return count;
    }
}