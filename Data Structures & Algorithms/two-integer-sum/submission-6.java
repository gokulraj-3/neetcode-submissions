class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i < nums.length; i++) {
            hs.put(nums[i],i);
        }
        for(int j=0;j < nums.length; j++) {
            if(hs.containsKey(target-nums[j]) && hs.get(target-nums[j]) != j) {
                ans[0] = j;
                ans[1] = hs.get(target-nums[j]);
                return ans;
            }
        }
        return ans;
    }
}
