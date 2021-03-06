class NumArray {
    
    public int[] sum;
    public NumArray(int[] nums) {
        int length = nums.length;
        sum = new int[length];
        System.arraycopy(nums, 0, sum, 0, nums.length);

        for (int i = 1; i < length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0)
            return sum[j];
        return sum[j] - sum[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
