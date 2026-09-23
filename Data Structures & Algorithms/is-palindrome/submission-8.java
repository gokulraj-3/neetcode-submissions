class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int h = s.length()-1;
        while(l<h) {
            if(!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(h))) {
                h--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(h))) {
                return false;
            }
            h--;
            l++;
        }
        return true;
    }
}
