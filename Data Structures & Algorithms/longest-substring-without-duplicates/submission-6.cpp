class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> mp;
        int left = 0, right = 0;
        int ans = 0;
        while(right < s.size()){
            if(mp[s[right]] > 0){
                left = max(mp[s[right]], left);
            }
            mp[s[right]] = right + 1;
            int len = right - left + 1;
            ans = max(len,  ans);
            right++;
        }
        return ans;
    }
};