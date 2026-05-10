class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> mp;
        int ans = 0;
        int i = 0, j = 0;
        while(j < s.size() && i < s.size()){
            if(mp[s[j]] > 0){
                i = max(mp[s[j]], i);
            }
            //
                ans = max((j - i + 1), ans);
                cout<<i<<" "<<j<<"\n";
            //}
            mp[s[j]] = j + 1;
            j++;
        }
        cout<<s[20];
        return ans;
    }
};
//s="pwwkew"

