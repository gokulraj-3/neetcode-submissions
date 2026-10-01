class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<s.length()) {
            while(j<s.length() && !st.contains(s.charAt(j))) {
                ans = Math.max(ans, j-i+1);
                st.add(s.charAt(j));
                j++;
            }
            st.remove(s.charAt(i));
            i++;
        }
        return ans;
    }
}
