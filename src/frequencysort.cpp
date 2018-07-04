#include <bits/stdc++.h>
#include <unordered_map>

using namespace std;

string frequencySort(string s) {
    unordered_map <char,int> freq;
    vector<string> bucket(s.size()+1, "");
    string res;
    
    for(char c:s) freq[c]++;

    for(auto& it:freq) {
        int n = it.second;
        char c = it.first;
        bucket[n].append(n, c);
    }
    for(int i=0; i<bucket.size(); i++) {
        cout << i << " " << bucket[i] << endl;
    }
    for(int i=s.size(); i>0; i--) {
        if(!bucket[i].empty())
            res.append(bucket[i]);
    }
    return res;
}


int main() {
    string s;
    cin >> s;
    cout << frequencySort(s) << endl;
    return 0;
} 