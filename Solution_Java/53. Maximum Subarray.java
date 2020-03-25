class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int [length];
        dp[0] = nums[0];
        int max = dp[0] ;
        if (length == 0)
            return 0;
        if (length ==1)
            return dp[0];
        for (int i= 1;i<length;i++){
            if (dp[i-1]>=0){
                dp[i] = dp[i-1] + nums[i];
                max = max > dp[i] ? max:dp[i];
            }
            else{
                dp[i] = nums[i];
                max = max > dp[i] ? max:dp[i];
            }
        }
        return max;
    }
}
