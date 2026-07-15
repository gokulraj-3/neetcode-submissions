class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a:asteroids) {
            if(st.isEmpty() || a > 0) {
                st.push(a);
            } else if (a < 0) {
                while(!st.isEmpty() && a!=0 && st.peek()>0) {
                    if(st.peek() > 0) {
                        if(st.peek() > Math.abs(a)) {
                            a = 0;
                        } else if (st.peek() == Math.abs(a)) {
                            a = 0;
                            st.pop();
                        } else {
                            st.pop();
                        }
                    }
                }
                if (a != 0) {
                   st.push(a);
                }
            }
        }
        int[] ans = new int[st.size()];
        int l = 0;
        for (int j : st) {
            ans[l] = j;
            l++;
        }
        return ans;
    }
}