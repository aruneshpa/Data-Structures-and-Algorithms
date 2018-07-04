public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++) {
            h.add(nums1[i]);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<nums2.length; i++) {
            if (h.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        int answer[] = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
