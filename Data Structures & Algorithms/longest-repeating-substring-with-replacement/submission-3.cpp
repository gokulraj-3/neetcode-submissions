class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int> freq;
        //freq= {B:1,A:3}
        int left = 0,right = 0;
        int ans = 0, max_freq = 0;
        
        while(right < s.size()){
            freq[s[right]]++;
            max_freq = max(max_freq, freq[s[right]]);
            
            int len = right - left + 1;
            if(len - max_freq <= k){
                ans = max(len, ans);
            }
            else{
                freq[s[left]]--;
                left++;
            }
            right++;  
        }
        return ans;
        
    }
};
