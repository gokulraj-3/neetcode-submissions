class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for (String s : strs) {
            ans = ans + s.length() + "#" + s;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<String>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            ans.add(str.substring(j + 1, i));
        }
        return ans;
    }
}
