class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        //store the count in map
        //key:value = number:count
        unordered_map<int,int> freq;
        for(int i = 0; i < nums.size(); i++){
            freq[nums[i]] += 1;
        }
        //create a list of{count, number}
        vector<pair<int,int>> count;
        for(const auto& p : freq){
            count.push_back({p.second,p.first});
        }
        //{1, 1},{2,2},{3,3}
        //sort on count in reverse order
        sort(count.rbegin(),count.rend());
        //add to a result array the top 2 elements
        vector<int> res;
        for(int i = 0; i < k; i++){
            res.push_back(count[i].second);
        }
        return res;
       
    }
};