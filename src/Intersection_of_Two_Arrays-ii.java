public class Solution {
    public int[] intersect(int[] a, int[] b) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n1 = a.length;
        int n2 = b.length;
        int n3 = Math.min(n1, n2);
        for(int i=0; i<n1; i++) {
            if (h.get(a[i]) == null) {
                h.put(a[i], 1);
            } else {
                h.put(a[i], h.get(a[i])+1);
            }
        }
        for(int i=0; i<n2; i++) {
            if (h.get(b[i]) != null && h.get(b[i]) > 0) {
                arr.add(b[i]);
                h.put(b[i], h.get(b[i]) -1);
            }
        }
        int ans[] = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
