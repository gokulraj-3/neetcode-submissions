class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(j < nums.length) {
            if(!hs.contains(nums[j])) {
                hs.add(nums[j]);
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return hs.size();
    }
}