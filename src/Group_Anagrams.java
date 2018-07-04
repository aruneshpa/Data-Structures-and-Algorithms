class Solution {

    public String Sort(String s) {
        char []ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(String s: strs) {
            String sorted = Sort(s);
            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(s);
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        for(List<String> i: map.values()) {
            ans.add(i);
        }
        return ans;
    }
}
