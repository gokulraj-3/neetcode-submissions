class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++) {
            s1[s.charAt(i)-'a']++;
            t1[t.charAt(i)-'a']++;
        }
        if(Arrays.toString(s1).equals(Arrays.toString(t1))){
            return true;
        }
        return false;
    }
}
