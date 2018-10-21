class Solution {
    public int trap(int[] height) {
       int l = 0, r = height.length - 1;
       int level = 0, water = 0;
       while (l < r) {
          int lower = height[l] < height[r] ? height[l++] : height[r--];
          level = Math.max(level, lower);
          water += level - lower;
       }

       return water;
    }
}
