class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        vector<int> freqs1(26,0);
        vector<int> freqs2(26,0);
        for(int i = 0; i < s1.size(); i++){
            freqs1[s1[i] - 'a'] += 1;
            freqs2[s2[i] - 'a'] += 1;
        }
        int l = 0, r = s1.size() - 1;
        while(r < s2.size() - 1){
            if(freqs1 == freqs2) return true;
            freqs2[s2[l] - 'a']--;
            l++;
            r++;
            freqs2[s2[r] - 'a']++;
        }
        if(freqs1 == freqs2) return true;
        return false;
    }
};
//keep a freq of characters in s1
//l
//
/*
freq array --> store freq of char of S1
a:1, b:1, c:1
62,63,64
a-a,b-a,c-a
62-62,63-62,64-62
s1 = a b b c
l= 0
r = l + s1.size();
s2 =  a b b e
     l  r
l e c
*/
         