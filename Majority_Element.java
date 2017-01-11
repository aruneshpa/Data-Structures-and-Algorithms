public class Solution {
    public int majorityElement(int[] a) {
        int n = a.length;
        int count = 0;
        int maj = a[0];
        for(int i=0; i<n; i++) {
            if (count == 0) {
                count = 1;
                maj = a[i];   
            } else if (maj == a[i]) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}
