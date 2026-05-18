class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums) {
            hs.add(i);
        }
        int ans = 1;
        for(int j:nums) {
            if(hs.contains(j+1) && !hs.contains(j-1)){
                int itr = j;
                int k  = 1;
                while(hs.contains(itr+1)) {
                    k++;
                    itr++;
                }
                ans = Math.max(k,ans);
            }
        }
        return ans;
    }
}
