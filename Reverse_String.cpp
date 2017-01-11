class Solution {
public:
    string reverseString(string s) {
        int i=0, j=s.size()-1;
        while(i<j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;j--;
        }
        return s;
    }
};
