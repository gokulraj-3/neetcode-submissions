class Solution {
public:
    int largest_element(vector<int>& arr){
        int maximum = INT_MIN;
        for(int i = 0; i < arr.size(); i++){
            maximum = max(maximum, arr[i]);
        }
        return maximum;
    }

    int totalHrs(vector<int>& arr, int h){
        int total_hours = 0;
        for(int i = 0; i < arr.size(); i++){
            total_hours += ceil((double)arr[i] / (double)h);
        }
        return total_hours;
    }

    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1;
        int high = largest_element(piles);
        int ans = INT_MAX;
        while(low<=high){
            int mid = (low + high)/ 2;
            int total_hours = totalHrs(piles, mid);
            if( total_hours <= h){
                high = mid - 1;
                ans = min(mid, ans);
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
        
    }
};
