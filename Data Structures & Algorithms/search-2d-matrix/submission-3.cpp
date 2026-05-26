class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size() - 1;
        int col = matrix[0].size() - 1;
        int low = 0;
        int high = row;
        int ans = 0;
        while(low<=high){
            int mid = (low + high) / 2;
            if(matrix[mid][0] <= target){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            } 
        }
        low=0;
        high=col;
        int i=ans;
        while(low<=high){
            int mid = (low + high) / 2;
            if(matrix[i][mid] <= target){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            } 
        }
        if(matrix[i][ans]== target) return true;
        return false;

        
    }
};
