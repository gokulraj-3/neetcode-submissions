class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans = new HashMap<>();
        for(String s:strs) {
            int[] fre = new int[26];
            for (char c:s.toCharArray()) {
                fre[c-'a']++;
            }
            String freq = Arrays.toString(fre);
            List<String> list = ans.getOrDefault(freq, new ArrayList<>());
            list.add(s);
            ans.put(freq,ans.getOrDefault(freq,list));
        }
        List<List<String>> fans = new ArrayList<>();
        for (String st:ans.keySet()) {
            fans.add(ans.get(st));
        }
        return fans;
    }
}
