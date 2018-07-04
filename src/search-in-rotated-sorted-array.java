class Solution {
    public int search(int[] nums, int x) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (nums[mid] == x)
                return mid;
            else if (nums[l] <= nums[mid]) {
                if (x >= nums[l] && x < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (x <= nums[r] && x > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}