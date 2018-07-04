#include<iostream>
using namespace std;

unsigned int reverse_bits(unsigned int n) {
		unsigned int fnum = 0;
        bool tr = false;
        if (((n>>31)&1) == 1) {
            cout<<"Out"<<endl;
			tr = true;
            n <<=1;
            n >>=2;
        }
        int i=0;
        while(i++ < 31 && n != 0) {
            fnum |= (n & 1);
            n>>=1;
            fnum<<=1;
        }
        fnum<<= 32-i;
        if (tr) fnum|= 1;
        return fnum;	
}

int main() {
	unsigned int n;
	cin>>n;
	cout<<reverse_bits(n)<<endl;
return 0;
}
