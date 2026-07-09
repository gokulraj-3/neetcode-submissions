class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String ans="";
        while(i<word1.length() && j<word2.length()) {
            ans=ans+word1.charAt(i)+word2.charAt(j);
            i++;
            j++;
        }
        if(i<word1.length()) {
            ans=ans+word1.substring(i,word1.length());
        }
        if(j<word2.length()) {
            ans=ans+word2.substring(j,word2.length());
        }
        return ans;
    }
}