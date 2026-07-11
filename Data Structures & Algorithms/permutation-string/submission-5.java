class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.toString(freq1).equals(Arrays.toString(freq2))) {
                return true;
        }
        int r = s1.length()-1;
        int l = 0;
        while(r<s2.length()-1) {
            r++;
            freq2[s2.charAt(r)-'a']++;
            freq2[s2.charAt(l)-'a']--;
            l++;
            if(Arrays.toString(freq1).equals(Arrays.toString(freq2))) {
                return true;
            }
        }
        return false;
    }
}
