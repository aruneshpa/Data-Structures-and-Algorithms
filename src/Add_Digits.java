public class Solution {
    /*
    public int sumDigits(int num) {
        int sum = 0;
        while(num != 0) {
            sum+= num%10;
            num/=10;
        }
        return sum;
    }
    */
    public int addDigits(int num) {
        /*
         *
         * while(num/10 != 0) {
         *    num = sumDigits(num);
         * }
         *
         * return num;
         */
        return (x%9 == 0) ? (x == 0) ? 0 : 9 : x%9; 
    }
}
