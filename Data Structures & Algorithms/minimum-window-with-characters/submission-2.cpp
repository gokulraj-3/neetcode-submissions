class Solution {
public:
    string minWindow(string s, string t) {
        if (s.empty() || t.empty()) return "";

        unordered_map<char, int> freq_t;
        for(char c : t){
            freq_t[c]++;
        }
        unordered_map<char, int> freq_s;
        int have = 0, need = freq_t.size();
        string ans;
        int ansLen = INT_MAX;
        int l = 0;
        for(int r = 0; r < s.size(); r++){
            char c = s[r];
            freq_s[c]++;
            if(freq_s[c] == freq_t[c]) have++;
            
            while(have == need){
                int len = r - l + 1;
                if(len < ansLen){
                    ans = s.substr(l, len);
                    ansLen = len;
                }
                freq_s[s[l]]--;
                if(freq_s[s[l]] < freq_t[s[l]]){
                    have--;
                }
                l++;
            }
        }
        return ans;    
    }

       
};


/*
create a frequency map of char of string t
freq_t = {}
calculate freq of t
freq_s = {} store the freq of char in string s
l=0,r=0
string ans;
int min_len = INT_MAX;
int have = 0, int need = freq.count;
while(r < s.size()){ 
    freq_s[s[r]] ++;
    if(freq_s[s[r]] == freq_t[t[r]]){
        have++;
    }
    while(have == need){
        len = r - l + 1;
        temp_string = s.substr(l,len)
        if(len < min_len){
            ans = temp_string;
            min_len = len;
        }
        freq_s[s[l]] --;
        if(freq_s[s[l]] < freq_t[t[r]]){
             have--;
        }
        l++;

    }
   r++;
}

*/