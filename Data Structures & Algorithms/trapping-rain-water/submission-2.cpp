class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size() - 1;
        vector<int> prefix(n+1);
        vector<int> suffix(n+1);
        prefix[0] = height[0];
        suffix[n] = height[n];
        for(int i = 1; i < height.size(); i++){
            prefix[i] = max(height[i],prefix[i - 1]);
        }
        for(int i = n - 1; i >=  0; i--){
            suffix[i] = max(height[i], suffix[i + 1]);
        }
        int water = 0;
        for(int i = 0; i < height.size(); i++){
            water += min(prefix[i], suffix[i]) - height[i];
        }
        return water;
    }
};

//0 2 2 3 3 3 3 3 3 3
//3 3 3 3 3 3 3 3 2 1

// 0 
//water = min(prefix[i], suffix[i]) - arr[i]

