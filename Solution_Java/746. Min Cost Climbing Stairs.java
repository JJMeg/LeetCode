class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        if(length == 0)
            return 0;
        if (length == 1)
            return cost[0];
        if (length == 2)
            return (cost[0]+cost[1])<cost[1] ? (cost[0]+cost[1]):cost[1];
        int[] dp = new int [length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2;i<length;i++){
            dp[i] = (dp[i-1] + cost[i]) < (dp[i-2] + cost[i]) ? (dp[i-1] + cost[i]) : (dp[i-2] + cost[i]);
        }
        return dp[length-1] < dp[length-2] ? dp[length-1] : dp[length-2];
    }
}
