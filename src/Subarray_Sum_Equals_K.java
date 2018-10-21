class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> h = new HashMap <Integer, Integer>();
        int sum = 0, ans = 0;
        h.put(0, 1);
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (h.containsKey(sum - k)) {
                ans += h.get(sum - k);
            }
            h.put(sum, h.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
