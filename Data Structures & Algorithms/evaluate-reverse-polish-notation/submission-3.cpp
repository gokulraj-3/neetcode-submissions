class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        int ans = 0;
        for(string c : tokens){
            if(c == "+" || c == "*" || c == "-" || c == "/"){
                int temp1 = st.top();
                st.pop();
                int temp2 = st.top();
                st.pop();
                if(c == "+")
                    ans = temp2 + temp1;
                else if(c == "*")
                    ans = temp2 * temp1;
                else if(c == "/")
                    ans = temp2 / temp1;
                else
                    ans = temp2 - temp1;
                st.push(ans);
            }
            else{
                ans = stoi(c);
                st.push(ans);
            }
        }
        return ans;
    }
};
