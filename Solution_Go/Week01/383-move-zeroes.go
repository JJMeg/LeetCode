func moveZeroes(nums []int)  {
    if len(nums) == 0 || len(nums) == 1 {
        return
    }

    i := 0
    j := 0
    for j<len(nums){
        if nums[j]!=0 {
            nums[i] = nums[j]
            i++
        }
        j++
    }

    for i < len(nums){
        nums[i] = 0
        i++
    }
}
