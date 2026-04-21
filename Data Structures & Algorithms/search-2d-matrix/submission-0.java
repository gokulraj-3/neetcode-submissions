class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        return helper(matrix, target, 0, m * n - 1);
    }

    public boolean helper(int[][] matrix, int target, int low, int high){
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        int row = mid / matrix[0].length;
        int col = mid % matrix[0].length;
        
        if (matrix[row][col] == target) {
            return true;
        } 
        else if (matrix[row][col] > target) {
            return helper(matrix, target, low, mid - 1);
        } 
        else {
            return helper(matrix, target, mid + 1, high);
        }
    }
}
