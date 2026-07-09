class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i=0;
        for(i=0;i<nums.length;i++) {
            if(hm.containsKey(target-nums[i])) {
                break;
            }
            hm.put(nums[i],i);
        }
        return new int[]{hm.get(target-nums[i]),i};
    }
}
