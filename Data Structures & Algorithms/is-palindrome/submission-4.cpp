class Solution {
public:
    bool isValid(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }
    bool isPalindrome(string s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            while(l < r && !isValid(s[l])){
                l++;
            }
            while(r > l && !isValid(s[r])){
                r--;
            }
            if(tolower(s[l]) != tolower(s[r])){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
};
