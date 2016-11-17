#include <iostream>
using namespace std;

int findZeros(int n) {
	int count = 0;
	int temp = 5;
	while(temp <=n) {
		count+= n/temp;
		temp*= 5;
	}
	return count;
}

int main() {
	int n;
	cin>>n;
	cout<<findZeros(n)<<endl;
	return 0;
}