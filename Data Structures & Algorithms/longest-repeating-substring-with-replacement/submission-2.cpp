class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int> freq;
        int n = s.size();
        int i = 0, j = 0;
        int maxfreq = 0;
        int ans = 0;
        while(i < n && j < n){
            int length = j - i + 1;
            freq[s[j]] += 1;
             maxfreq = max(freq[s[j]], maxfreq);
            if(length - maxfreq <= k){
                ans = max(length, ans);                
            }
            else{
                freq[s[i]]--;
                i++;
            }
            j++;
            //B A A A C C D E F E A  k = 3
            //i
            //j
            //length of the substring = j - i + 1
        }
        return ans;
        //freq= {B:1,A:3}
    }
};
