class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet();
        int max = 0;
        int r = 0;
        int l = 0;
        while(r<s.length()){
            if(!hs.contains(s.charAt(r))) {
                max = Math.max(max,r-l+1);
                hs.add(s.charAt(r));
                r++;
            } else {
                while(hs.contains(s.charAt(r))){
                    hs.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return max;
    }
}
