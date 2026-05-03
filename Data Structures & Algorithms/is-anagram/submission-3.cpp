class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int> vec1(26, 0);
        vector<int> vec2(26, 0);
        if(s.size()!= t.size()){
            return false;
        }
        for(int i = 0; i< s.size()  ; i++){
            vec1[s[i] - 'a'] += 1;
            vec2[t[i] - 'a'] += 1;
        }
        for(int i = 0; i < 26; i++){
            if(vec1[i] != vec2[i]){
                return false;
            }
        }
        return true;

    }
};
