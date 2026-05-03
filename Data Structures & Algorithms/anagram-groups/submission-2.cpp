class Solution {
public:
    bool is_anagram(string s1, string s2){
        if(s1.size()!=s2.size()) return false;
        vector<int> vec1(26, 0);
        vector<int> vec2(26, 0);
        for(int i = 0; i < s1.size();i++){
            vec1[s1[i] - 'a'] += 1;
            vec2[s2[i] - 'a'] += 1;
        }
        for(int i = 0; i < 26; i++){
            if(vec1[i] != vec2[i]) return false;
        }
        return true;
    }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        vector<int> vis(strs.size());
        for(int i = 0; i< strs.size(); i++){
            if(vis[i]) continue;
            vector<string> temp;
            temp.push_back(strs[i]);
            for(int j = i+1; j < strs.size(); j++){
                if(is_anagram(strs[i],strs[j])){
                    temp.push_back(strs[j]);
                    vis[j] = 1;
                }
            }
            ans.push_back(temp);
        }
        return ans;
    }
};
