class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s:strs) {
            int[] freq = new int[26];
            for (char c:s.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            ArrayList<String> entry = hs.getOrDefault(key,new ArrayList<String>());
            entry.add(s);
            hs.put(key, entry);
        }
        for(String a:hs.keySet()) {
            ans.add(hs.get(a));
        }
        return ans;
    }
}
