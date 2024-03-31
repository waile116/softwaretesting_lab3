// This is a mutant program.
// Author : ysma

public class Knapsack
{

    public  int knapsack( int[] weights, int[] values, int capacity )
    {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity;) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else {
                    if (weights[i - 1] <= w) {
                        dp[i][w] = Math.max( values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w] );
                    } else {
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }
        }
        return dp[n][capacity];
    }

}
