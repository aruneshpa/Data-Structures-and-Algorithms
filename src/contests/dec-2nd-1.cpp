
#include <bits/stdc++.h>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <cstring>
#include <chrono>
#include <complex>
#define endl "\n"
#define ll long long int
#define vi vector<int>
#define vll vector<ll>
#define vvi vector < vi >
#define pii pair<int,int>
#define pll pair<long long, long long>
#define mod 1000000007
#define inf 1000000000000000001;
#define all(c) c.begin(),c.end()
#define mp(x,y) make_pair(x,y)
#define mem(a,val) memset(a,val,sizeof(a))
#define eb emplace_back
#define f first
#define s second

using namespace std;

vector<int> dailyTemperatures(vector<int>& t) {
    stack<int> v;
    std::vector<int> ans;
    v.push(0);
    for(int i=1; i< t.size(); i++) {
    	int next = t[i];
    	if (!v.empty()) {
    		int elem = t[v.top()];
    		v.pop();
			while (elem < next) {
				ans.push_back(next - elem);
				if (v.empty()) break;
				elem = t[v.top()];
				v.pop();
    		}
    		if (elem > next) {
    			v.push(next);
    		}
    	}
    	v.push(i);
    }
    while (!v.empty()) {
    	ans.push_back(0);
    }
    return ans;
}

int inc(int n) {
	string s = to_string(n);
	for(int i=0; i<s.size()-1; i++) {
		if (s[i] - '0' > s[i+1] - '0') return 0;
	}
	return 0;
}

int monotoneIncreasingDigits(int n) {
	while (n < 0) {
		if (inc(n)) {
			return n;
		}
		n--;
	}
	return 0;
}

int main()
{
	// vector<int> v = {73, 74, 75, 71, 69, 72, 76, 73};
	// std::vector<int> ans = dailyTemperatures(v);
	
	std::vector<char> v = {'3', '3', '2'};
	for(int i=0; i<v.size() - 1; i++) {
		if (v[i] - '0' > v[i+1] - '0') {
			v[i] -= 1;
			for(int j=i+1; j<v.size(); j++) {
				v[j] = '9';
			}
			break;
		}
	}
	for(char ch: v) {
		if (ch != '0')
		cout << ch << " ";
	}
	cout << endl;
	return 0;
}
