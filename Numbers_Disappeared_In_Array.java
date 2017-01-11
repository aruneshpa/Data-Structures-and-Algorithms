public class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        int n = a.length;
        for(int i=0; i<n; i++) {
            if (a[Math.abs(a[i]) - 1] > 0)
                a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=1; i<=n; i++) {
            if (a[i-1] > 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
