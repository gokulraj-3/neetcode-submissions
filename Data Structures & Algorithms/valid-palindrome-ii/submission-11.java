class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int maxP = 0;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return (isPalindrome(s.substring(i+1,j+1)) || isPalindrome(s.substring(i,j)));
            }
            i++;
            j--;
        }
        return true;
    }
    public Boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(j>i) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}