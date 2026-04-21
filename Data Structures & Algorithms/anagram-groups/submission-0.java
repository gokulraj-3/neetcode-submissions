class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<String> strs = new ArrayList<>(Arrays.asList(str));
        int pos = 0;
        List<List<String>> ans = new ArrayList();
        while(strs.size() != 0) {
            String st = strs.get(pos);
            List<String> fans = new ArrayList();
            fans.add(st);
            
            int pos2 = pos + 1;
            while(pos2 < strs.size()){
                if(checkAnagram(st,strs.get(pos2))){
                    fans.add(strs.get(pos2));
                    strs.remove(strs.get(pos2));
                } else {
                    pos2++;
                }
            }
            strs.remove(st);
            ans.add(fans);
        }
        return ans;
    }

    public boolean checkAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            } else {
                hm.put(s.charAt(i),1);
            }
        }
        for (int j=0;j<t.length();j++){
            if(!hm.containsKey(t.charAt(j))){
                return false;
            } else {
                if(hm.get(t.charAt(j)) == 1){
                    hm.remove(t.charAt(j));
                } else {
                    hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
                }
            }
        }
        return true;
    }
}
