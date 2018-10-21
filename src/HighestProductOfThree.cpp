#include <bits/stdc++.h>
using namespace std;

int fun(vector<int> v) {
	int maax2, min2, maxtotal, largest, smallest;
	max2 = max(v[0] * v[1], max(v[1] * v[2], v[0] * v[2]));
	min2 = min(v[0] * v[1], min(v[1] * v[2], v[0] * v[2]));
	largest = max(v[0], max(v[1], v[2]));
	smallest = min(v[0], min(v[1], v[2]));
	maxtotal = max2;

	for(int i=3; i<n; i++) {
		if (maxtotal < max2 * nums[i]) {
			maxtotal = max2 * nums[i];
			if (largest < 0) {
				max2 = max2/smallest * nums[i];
			}
			largest = max(largest, nums[i]);
		}
		if (max2 < 0) {
			max2 = max2/maxi * nums[i]
		}
	}
}

int main() {
	int n;
	cin >> n;
	std::vector<int> v(n);
	for(int i=0; i<n; i++) {
		cin >> v[i];
	}
	cout << fun(v) << endl;
	return 0;
}
