class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String res = "000";
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1c = new int[26];
        int[] s2c = new int[26];
        for(int i = 0; i<s1.length(); i++) {
            s1c[s1.charAt(i) - 'a']++;
            s2c[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int j= 0;j < 26; j++) {
            if(s1c[j] == s2c[j]){
                matches++;
            }
        }
        if (matches == 26) {
            return true;
        }
        int l = 0;
        int r = s1.length()-1;
        while(r<s2.length()-1){
            r++;
            int rind = s2.charAt(r) - 'a';
            s2c[rind]++;
            if(s1c[rind] == s2c[rind]) {
                matches++;
            } else if (s1c[rind] == s2c[rind]-1) {
                matches--;
            }
            
            int lind = s2.charAt(l) - 'a';
            s2c[lind]--;
            if(s1c[lind] == s2c[lind]) {
                matches++;
            } else if (s1c[lind] == s2c[lind]+1){
                matches--;
            }
            l++;
            if(matches == 26){
                return true;
            }       
        }
        return false;
    }
}