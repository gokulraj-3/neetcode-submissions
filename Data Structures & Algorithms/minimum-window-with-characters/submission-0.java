class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        HashMap<Character, Integer> ht = new HashMap<>();
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (ht.get(c) != null) {
                ht.put(c, ht.get(c) + 1);
            } else {
                ht.put(c, 1);
            }
        }
        int need = ht.size();
        int have = 0;
        int l = 0;
        String res = "";
        int min = Integer.MAX_VALUE;
        for (int r = 0;r < s.length();r++) {
            char rc = s.charAt(r);
            hs.put(rc, hs.getOrDefault(rc, 0)+1);
            if(ht.containsKey(rc) && (hs.get(rc) == ht.get(rc))) {
                have++;
            }
            while(need == have) {
                if (min > r-l+1) {
                    res = s.substring(l,r+1);
                    min = r-l+1;
                }
                char lc = s.charAt(l);
                if(ht.containsKey(lc) && (hs.get(lc) == ht.get(lc)) ) {
                    have--;
                }
                hs.put(lc, hs.get(lc)-1);
                l++;
            }
        }
        return res;
    }
}
