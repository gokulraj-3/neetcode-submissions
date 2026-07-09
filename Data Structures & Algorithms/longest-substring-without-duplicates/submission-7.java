class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        int l = 0;
        int r = 0;
        while(l<s.length()) {
            while(r<s.length() && !hs.contains(s.charAt(r))) {
                hs.add(s.charAt(r));
                r++;
            }
            max = Math.max(max,r-l);
            hs.remove(s.charAt(l));
            l++;
        }
        return max;
    }
}
