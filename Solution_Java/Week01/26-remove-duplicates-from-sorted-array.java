class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length==1){
            return 1;
        }
        int i=0;
        int j=i+1;
        while (j<nums.length){
            if (nums[i]!=nums[j]){
                nums[++i] = nums[j];
            }
            j+=1;

        }
        return i+1;
    }
}
