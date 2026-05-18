class Solution {
public:
    char inverse(char c){
        if(c == '}') return '{';
        if(c == ']') return '[';
        if(c == ')') return '(';
        //return c;
    }

    bool isValid(string s) {
        stack<char> st;
        for(int i = 0; i< s.size(); i++){
            if(s[i] == '[' || s[i] == '{' || s[i] == '(' ){
                st.push(s[i]);
            }
            else{
                if(!st.empty() && inverse(s[i])== st.top()){
                    st.pop();
                }
                else{
                    return false;
                } 
            }
        }
        if(st.empty()) return true;
        return false;
    }
};




