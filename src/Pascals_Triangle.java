class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> curr = new ArrayList<>();
        curr.add(1);

        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> next = new ArrayList<>();
            next.add(curr.get(0));
            for(int j = 0; j < curr.size() - 1; j++) {
                next.add(curr.get(j) + curr.get(j+1));
            }
            next.add(curr.get(curr.size() - 1));
            curr = new ArrayList(next);
        }
        return curr;
    }
}
