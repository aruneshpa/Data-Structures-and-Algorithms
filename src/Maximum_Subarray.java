class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for(int i: nums) {
            maxEndingHere = Math.max(maxEndingHere + i, i);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
