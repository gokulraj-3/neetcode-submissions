class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hs = new HashMap<>();
        hs.put(']', '[');
        hs.put(')','(');
        hs.put('}','{');
        if(s.length()==0 || s.length()==1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(hs.containsKey(c)) {
                if(st.isEmpty() || st.pop()!=hs.get(c)) {
                    return false;
                }
            } else {
                st.push(c);
            }
        }

        if(!st.isEmpty()) {
            return false;
        }
            return true;
    }
}
