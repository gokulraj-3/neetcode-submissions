class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap();
        for (String s:strs){
            int[] arr = new int[26];
            for (char ch:s.toCharArray()){
                arr[ch - 'a']++;
            }
            String key = Arrays.toString(arr);
            hs.putIfAbsent(key, new ArrayList<>());
            hs.get(key).add(s);
        }
        return new ArrayList<>(hs.values());
    }
        

}
