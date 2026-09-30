class Solution {
    public boolean isAnagram(String s, String t) {
        return anas(s).equals(anas(t));
    }

    public String anas(String s) {
        int[] ans = new int[26];
        for (char c:s.toCharArray()) {
            ans[c-'a']+=1;
        }
        return Arrays.toString(ans);
    }
}
