class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> o = new HashMap<>(Map.ofEntries(
            Map.entry('{','}'),
            Map.entry('[',']'),
            Map.entry('(', ')')
        ));
        Deque<Character> st = new ArrayDeque<>();
        for(char ch:s.toCharArray()) {
            if(o.containsKey(ch)) {
                st.push(ch);
            }
            else {
                if(st.isEmpty() || ch != o.get(st.pop())) {
                    return false;
                }
            }
        }
        if(st.isEmpty()) {
            return true;
        }
        return false;
    }
}
