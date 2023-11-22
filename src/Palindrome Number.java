class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = Integer.toString(x);
        String s1 = new StringBuilder(s).reverse().toString();
        return (s1.equals(s));
    }

}