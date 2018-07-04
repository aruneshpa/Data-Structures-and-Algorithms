def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    ans = []
    nums.sort()
    for i in range(len(nums)):
        if i != 0 and nums[i] == nums[i-1]:
            i += 1
            continue
        j = i+1
        k = len(nums) - 1
        while j < k:
            print(j)
            if j != i+1 and nums[j] == nums[j-1]:
                j += 1
                continue
            s = nums[i] + nums[j] + nums[k]
            if s == 0:
                ans.append([nums[i], nums[j], nums[k]])
                j += 1
            elif s < 0:
                j += 1
            else:
                k -= 1
    return ans

if __name__ == "__main__":
    nums = [-1,0,1,2,-1,-4]
    print(threeSum(nums))