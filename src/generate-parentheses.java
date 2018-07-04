class Solution {
    
    public void helper(List<String> ans, String temp, int l, int r, int n) {
        if(temp.length() == 2*n) {
            ans.add(temp);
            return;
        }
        if (l < n)
            helper(ans, temp + "(", l+1, r, n);
        if (r < l)
            helper(ans, temp + ")", l, r+1, n);
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }
}