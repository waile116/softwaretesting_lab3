// This is a mutant program.
// Author : ysma

public class Knapsack
{

    public  int knapsack( int[] weights, int[] values, int capacity )
    {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        return dp[n][capacity];
    }

}
