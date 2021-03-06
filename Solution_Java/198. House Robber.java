class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) 
            return 0;
        if (length == 1)
            return nums[0];
        if (length == 2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = nums[0]>nums[1]?nums[0]:nums[1];
        int max = dp[1];
        for (int i=2;i<length;i++){
            dp[i] = (nums[i] + dp[i-2])>dp[i-1]?(nums[i] + dp[i-2]):dp[i-1];
            max = max>dp[i]?max:dp[i];
        }
        return max;
    }
}
