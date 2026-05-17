class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int> dq;
        vector<int> ans;

        for(int i = 0; i < nums.size(); i++){
            if(i - k == dq.front()) dq.pop_front(); //removing previous window element
            //popping indexes of small elements from back of the queue
            while(!dq.empty() && nums[i] > nums[dq.back()]){
                dq.pop_back();
            }
            //adding current index
            dq.push_back(i);
            //adding maximum element to answer(queue always will be in descending order)
            if(i >= k - 1){
                ans.push_back(nums[dq.front()]);
            }
        }
        return ans;

    }
};






