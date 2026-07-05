class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0 || nums.length == 1) {
            return false;
        }
        int l = 0;
        int r = k;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<=k;i++) {
            if(hs.contains(nums[i])) {
                return true;
            } else {
                hs.add(nums[i]);
            }
        }
        while(r<nums.length-1) {
            hs.remove(nums[l]);
            l++;
            r++;
            if(hs.contains(nums[r])) {
                return true;
            }
            else {
                hs.add(nums[r]);
            }
        }
        return false;
    }
}