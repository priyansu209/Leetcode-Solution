class Solution {
    public boolean judgeSquareSum(int c) {
        long low = 0;
        long end = (long) Math.sqrt(c);

        while (low <= end) {
            long sum = low * low + end * end;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                low++;
            } else {
                end--;
            }
        }

        return false;
    }
}