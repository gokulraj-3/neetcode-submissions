class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> mp;
        int ans = 0;
        int l = 0, r = 0;
        while(r < s.size()){
            if(mp[s[r]] > 0){
                l = max(mp[s[r]], l);
            }
            int len  = r - l + 1;
            ans = max(len, ans);
            mp[s[r]] = r + 1;
            r++;
        }
        return ans;
    }
};
//s="pwwkew"

