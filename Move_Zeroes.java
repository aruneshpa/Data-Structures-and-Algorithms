public class Solution {
    public void moveZeroes(int[] a) {
        int copy_in = 0;
        for(int i=0; i<a.length; i++) {
            if (a[i] != 0) {
                a[copy_in] = a[i];
                copy_in++;
            }
        }
        for(int i=copy_in; i<a.length; i++) {
            a[i] = 0;
        }
    }
}
