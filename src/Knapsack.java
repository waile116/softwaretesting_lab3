
public class Knapsack {
    /*public void main (String[] args){
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 7;

        int maxValue = knapsack(weights, values, capacity);

        System.out.println(maxValue);
    }*/

    public int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }
                // if knapsack can fit current item
                else if (weights[i - 1] <= w) {
                    // current best knapsack value = max(current item value + best value of remaining capacity,
                    // best value before adding current item)
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                }
                // if knapsack cannot fit current item
                else {
                    // current best knapsack value = best value before current item
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }
}
