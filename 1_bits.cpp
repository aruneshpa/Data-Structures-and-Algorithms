#include <iostream>
using namespace std;
int main() {
	uint32_t n;
	cin>>n;
	int count = 0;
	while(n) {
		n = n&(n-1);
		count++;
	}
	cout<<count<<endl;
	return 0;
}