class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int k1 = i+1;
            int k2 = nums.length - 1;
            int target = 0 - nums[i];
            while(k1<k2) {
                int sum = nums[k1] + nums[k2];
                if(sum==target) {
                    ArrayList<Integer> entry = new ArrayList<>();
                    entry.add(nums[i]);
                    entry.add(nums[k1]);
                    entry.add(nums[k2]);
                    ans.add(entry);
                    while (k1 < k2 && nums[k1] == nums[k1 + 1]) k1++;
                    while (k1 < k2 && nums[k2] == nums[k2 - 1]) k2--;
                    k1++;
                    k2--;
                } else if(sum > target) {
                    k2--;
                } else {
                    k1++;
                }
            }
        
        }
        return ans;
    }
}
