class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashSet<Character> hm = new HashSet<>();
        int ans = 0;
        while (j < s.length()) {
            if (!hm.contains(s.charAt(j))) {
                hm.add(s.charAt(j));
                j++;
                ans = Math.max(ans, hm.size());
            } else {
                hm.remove(s.charAt(i));
                i++;
            }

        }
        return ans;
    }
}
