class Solution {
    int reverse = 0;
    public int checkPalindrome(int n){
        if(n == 0) return reverse;
        reverse = reverse * 10 + (n%10);
        return checkPalindrome(n/10);

    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp  = x;
        int reversed = checkPalindrome(temp);
        if(reversed == x) return true;
        else return false;
    }
}