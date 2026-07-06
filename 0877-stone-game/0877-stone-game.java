import java.util.Arrays;

class Solution {

    public int Solve(int i, int j, int[] piles, int[][] dp) {
        if (i > j) return 0;

        if (i == j) {
            return dp[i][j] = piles[i];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int start = piles[i] +
                Math.min(
                        Solve(i + 2, j, piles, dp),
                        Solve(i + 1, j - 1, piles, dp)
                );

        int end = piles[j] +
                Math.min(
                        Solve(i, j - 2, piles, dp),
                        Solve(i + 1, j - 1, piles, dp)
                );

        return dp[i][j] = Math.max(start, end);
    }

    public boolean stoneGame(int[] piles) {

        int n = piles.length;
        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int alice = Solve(0, n - 1, piles, dp);

        int total = 0;
        for (int pile : piles) {
            total += pile;
        }

        int bob = total - alice;

        return alice > bob;
    }
}