class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums) {
            hs.add(i);
        }
        int max = 1;
        for(int j:nums){
            if(!hs.contains(j-1) && hs.contains(j+1)){
                int cnt = 0;
                int p = j;
                while(hs.contains(p)) {
                    cnt++;
                    p++;
                }
                if(cnt>max){
                    max = cnt;
                }
            }
        }
        return max;
    }
}
