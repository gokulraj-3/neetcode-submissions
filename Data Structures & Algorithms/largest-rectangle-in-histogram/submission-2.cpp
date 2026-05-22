class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        vector<int> prefix(heights.size());
        vector<int> suffix(heights.size());
        int ans = 0;
        stack<int> st;
        for(int i = 0; i <heights.size(); i++){
            while(!st.empty() && heights[i] <= heights[st.top()])
                st.pop();
            if(!st.empty()){
                prefix[i] = st.top() + 1;
            }
            else
                prefix[i] = 0;
            st.push(i);
        }
        
        stack<int> st1;
        for(int i = heights.size() - 1; i >= 0; i--){
            while(!st1.empty() && heights[i] <= heights[st1.top()])
                st1.pop();
            if(!st1.empty()){
                suffix[i] = st1.top() - 1;
            }
            else
                suffix[i] = heights.size() - 1;
            st1.push(i);
        }
        
        for(int i = 0; i < heights.size(); i++){
            int area = heights[i] * (suffix[i] - prefix[i] + 1);
            ans = max(ans, area);
        }
        return ans;


    }
};
