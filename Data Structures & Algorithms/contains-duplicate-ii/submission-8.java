class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) {
            return false;
        }
        int l = 0;
        int h = 1;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(nums[0]);
        while(h<nums.length) {
            if(hs.contains(nums[h])) {
                return true;
            }
            else if((h-l) < k) {
                hs.add(nums[h]);
                h++;
            }
            else {
                hs.remove(nums[l]);
                l++;
                hs.add(nums[h]);
                h++;
            }
        }
        return false;
    }
}