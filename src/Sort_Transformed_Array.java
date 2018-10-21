class Solution {
   public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
      int []sorted = new int[nums.length];
      int index = (a > 0) ? nums.length - 1 : 0;
      int i = 0, j = nums.length - 1;
      while (i <= j) {
         int qi = quad(nums, i, a, b, c);
         int qj = quad(nums, j, a, b, c);
         if (a > 0) {
            sorted[index] = qi > qj ? qi : qj;
            if (sorted[index] == qi) i++;
            else  j--;
            index--;
         } else {
            sorted[index] = qi < qj ? qi : qj;
            if (sorted[index] == qi) i++;
            else j--;
            index++;
         }
      }
      return sorted;
   }

   int quad(int []nums, int i, int a, int b, int c) {
      return nums[i] * nums[i] * a + nums[i] * b + c;
   }
   
}
