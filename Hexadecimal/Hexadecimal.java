public class Solution {
    public String toHexHelper(int num, int base, HashMap<Integer, String>h) {
        String s = "";
        for(int i=0; num != 0 && i<8; i++) {
            if ((num&15) >= 10) {
                s = h.get(num&15) + s;
            } else {
                s = Integer.toString(num&15) + s;
            }
            num = num >> 4;
        }
        return (s == "")?"0":s;
    }
    
    public String toHex(int num) {
        HashMap<Integer, String>h = new HashMap<Integer, String>();
        h.put(10, "a");
        h.put(11, "b");
        h.put(12, "c");
        h.put(13, "d");
        h.put(14, "e");
        h.put(15, "f");
        
            return toHexHelper(num, 16, h);
       
    }
}
