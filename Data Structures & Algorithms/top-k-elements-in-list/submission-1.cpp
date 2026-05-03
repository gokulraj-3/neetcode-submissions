class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        //store the count
        unordered_map<int,int> count;
        for(int i = 0;i<nums.size();i++){
            count[nums[i]] += 1;
        }
        //create a list of the pair in count
        vector<pair<int,int>> arr;
        for(const auto& p : count){
            arr.push_back({p.second, p.first});
        }
        //sort the pair in descending order
        sort(arr.rbegin(), arr.rend());

        //store top 2 number in ans list
        vector<int> ans;
        for(int i = 0; i< k; i++){
            ans.push_back(arr[i].second);
        }
        return ans;
    }
};