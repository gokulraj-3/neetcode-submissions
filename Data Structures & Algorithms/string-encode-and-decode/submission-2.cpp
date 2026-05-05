class Solution {
public:

    // string getKey(string s){
    //     vector<int> count(26,0);
    //     for(char c : s){
    //         count[c - 'a'] += 1
    //     }
    //     string key;
    //     for(int i : count){
    //         key += to_string(i);
    //     }
    //     key = string(s.size()) + key;
    //     return key
    // }

    string encode(vector<string>& strs) {
        string encoded_string;
        for(const string& s : strs){
            string key = to_string(s.size()) + '#' + s;
            encoded_string += key;
        }
        // cout<<encoded_string;
        return encoded_string;
    }

    vector<string> decode(string s) {
        vector<string> res;
        int i = 0;
        while(i < s.size()){
            int j = i;
            while(s[j] != '#'){
                j++;
            }
            //identify the length of string from encoded string
            int length = stoi(s.substr(i, j- i));
            i = j + 1;
            res.push_back(s.substr(i,length));
            i += length;
        }
        return res;
    }
};
