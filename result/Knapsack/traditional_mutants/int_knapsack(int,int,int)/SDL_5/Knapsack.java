// This is a mutant program.
// Author : ysma

public class Knapsack
{

    public  int knapsack( int[] weights, int[] values, int capacity )
    {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
            }
        }
        return dp[n][capacity];
    }

}
