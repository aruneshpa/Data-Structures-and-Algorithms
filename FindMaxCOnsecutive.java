	public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                while(i<nums.length && nums[i] == 1) {
                    count++;
                    i++;
                }
                if (count > max) max = count;
            }
            count = 0;
        }
        return max;
   	}
