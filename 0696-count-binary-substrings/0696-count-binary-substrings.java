class Solution {
    public int countBinarySubstrings(String s) {

        List<Integer> groups = new ArrayList<>();

        int count = 1;

        // Step 1: Build group-size array
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                groups.add(count);
                count = 1;
            }
        }

        // Add the last group
        groups.add(count);

        // Step 2: Compare adjacent groups
        int ans = 0;

        int left = 0;
        int right = 1;

        while (right < groups.size()) {
            ans += Math.min(groups.get(left), groups.get(right));
            left++;
            right++;
        }

        return ans;
    }
}