class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int res = 0;
        HashMap<Character,Integer> hs = new HashMap<>();
        int l = 0;
        for (int r = 0;r < s.length();r++) {
            if (!hs.containsKey(s.charAt(r))) {
                hs.put(s.charAt(r),1);
            } else {
                hs.put(s.charAt(r), hs.get(s.charAt(r)) + 1);
            }
            max = Math.max(max, hs.get(s.charAt(r)));
            while (((r-l+1) - max) > k ){
                hs.put(s.charAt(l), hs.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
