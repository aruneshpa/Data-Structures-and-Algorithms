class Solution {
    public int rob(int[] nums) {
        int f = 0, l = 0, n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        f = nums[0]; l = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++) {
            int temp = Math.max(f + nums[i], l);
            f = l;
            l = temp;
        }
        return l;
    }
}
