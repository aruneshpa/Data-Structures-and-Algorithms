	public static int find2(int[] nums) {
        int l=0, r=0, z =0, count = -1;
        while(r < nums.length) {
            if(z <= 1) {
                if (nums[r] == 0) z++;
                r++;
            }
            if (z > 1) {
                if (nums[l] == 0) z--;
                l++;
            }
            if (r - l > count) count = r-l;
        }
        return count;
    }
