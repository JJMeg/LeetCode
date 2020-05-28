func searchInsert(nums []int, target int) int {
    i:=0
    j := len(nums)-1

    for i<=j {
        middle := (i+j)/2
        if nums[middle] == target{
            return middle
        }
        if nums[middle] > target{
            j = middle - 1
        }else{
            i = middle + 1
        }
    }

    return i
}
