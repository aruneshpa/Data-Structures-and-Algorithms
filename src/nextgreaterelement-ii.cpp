#include <bits/stdc++.h>
using namespace std;

vector<int> nextGreaterElements(vector<int>& nums) {
    stack<int> st;
    int n = nums.size();
    vector<int> ans(n, 10001);
    map<int, vector<int> > m;

    for(int i=0, count = 0; count < 2*n; i = (i+1)%n) {
        if (m.find(nums[i]) == m.end())
            m[nums[i]] = vector<int>();
        m[nums[i]].push_back(i);
        if (st.empty()) {
            st.push(nums[i]);
            continue;
        }
        if (st.top() > nums[i]) {
            st.push(nums[i]);
        } else {
            while (!st.empty() && st.top() < nums[i]) {
                for(int j: m[st.top()]) {
                    if (ans[j] == 10001) {
                        ans[j] = nums[i];
                    }
                }
                st.pop();
            }
            st.push(nums[i]);
        }
        count++;
    }
    for(int i=0; i<n; i++) {
        if (ans[i] == 10001)
            ans[i] = -1;
    }
    return ans;
}

int main() {
    int n;
    cin >> n;
    std::vector<int> v(n);
    for(int i=0; i<n; i++) {
        cin >> v[i];
    }
    std::vector<int> ans;
    ans = nextGreaterElements(v);
    for(int i:ans) {
        cout << i << endl;
    }
    return 0;
}