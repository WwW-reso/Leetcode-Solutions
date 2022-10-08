class Solution {


    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int reverse =0;
        int v = x;
        int operator = 10;
        while(v >= 10){
            reverse += v % 10;
            v /= 10;
            reverse *= 10;
        }
        reverse += v;
        return reverse == x;
    }
}