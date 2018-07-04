#include <iostream>
using namespace std;
int main() {
	int n;
	cin>>n;
	string s = "";
	while(n>0) {
		char c = (n-1)%26 + 'A';
		s =  string(1, c) + s;
		n = (n-1)/26;
	}
	cout<<s<<endl;
	return 0;
}