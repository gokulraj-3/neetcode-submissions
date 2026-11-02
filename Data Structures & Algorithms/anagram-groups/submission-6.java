class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s:strs) {
            String ang = anagram(s);
            if(hm.get(ang) == null) {
                List<String> ent = new ArrayList<>();
                ent.add(s);
                hm.put(ang,ent);
            } else {
                hm.get(ang).add(s);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String st:hm.keySet()) {
            ans.add(hm.get(st));
        }
        return ans;
    }

    public String anagram(String str) {
        int[] ang = new int[26];
        for(int i=0;i<str.length();i++) {
            ang[str.charAt(i)-'a']++;
        }
        return Arrays.toString(ang);
    }
}
