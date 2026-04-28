class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> hs = new HashSet();
        for (char ch:s.toCharArray()){
            hs.add(ch);
        }
        int max = 0;
        for (char c:hs){
            int l = 0;
            int r = 0;
            int cnt = 0;
            while(r<s.length()){
                if(s.charAt(r)==c){
                    cnt++;
                }
                if((r-l+1) - cnt <= k){
                    max = Math.max(r-l+1,max);
                    r++;
                } else {
                    while((r-l+1) - cnt > k) {
                        if (s.charAt(l)==c){
                            cnt--;
                        }
                        l++;
                    }
                }
            }
        }
        return max;
    }
}
