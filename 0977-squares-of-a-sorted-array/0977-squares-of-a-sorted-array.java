class Solution {

    private static int[] Reverse(int[] nums) {
        int i = 0;
        int end = nums.length - 1;

        while (i < end) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            i++;
            end--;
        }
        return nums;
    }

    public int[] sortedSquares(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int mid = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < 0 && nums[i + 1] >= 0) {
                mid = i;
                break;
            }
        }

        // case: all numbers are negative
        if (nums[nums.length-1]<0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            Reverse(nums);
            return nums;
        }

        // case: all numbers are non-negative
        else if (mid == -1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }

        // mixed negative and positive
        else {
            int[] neg = new int[mid - l + 1];
            int[] pos = new int[r - mid];

            for (int i = 0; i < neg.length; i++) {
                neg[i] = nums[i] * nums[i];
            }

            for (int i = 0; i < pos.length; i++) {
                pos[i] = nums[mid + 1 + i] * nums[mid + 1 + i];
            }

            Reverse(neg);

            int left = 0;
            int right = 0;
            int main = 0;

            while (left < neg.length && right < pos.length) {
                if (neg[left] < pos[right]) {
                    nums[main++] = neg[left++];
                } else {
                    nums[main++] = pos[right++];
                }
            }

            while (left < neg.length) {
                nums[main++] = neg[left++];
            }

            while (right < pos.length) {
                nums[main++] = pos[right++];
            }

            return nums;
        }
    }
}
