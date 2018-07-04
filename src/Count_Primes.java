class Solution {

    public int countPrimes(int n) {
        int ans = 0;
        boolean []isprime = new boolean [n];
        for(int i=2; i<n; i++) isprime[i] = true;
        
        for(int i=2; i * i < n; i++) {
            if (isprime[i]) {
                for(int j=i*i; j < n; j += i) isprime[j] = false;
            }
        }
        for(boolean b: isprime) {
            ans += b ? 1 : 0;
        }
        return ans;
    }
}
