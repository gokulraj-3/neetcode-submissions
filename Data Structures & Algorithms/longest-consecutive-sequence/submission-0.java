class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for(int n:nums){
            hs.add(n);
        }
        int max = 0;
        for (int n1:nums){
            int cntr = 1;
            if(!hs.contains(n1-1)){
                int k = n1+1;
                while(hs.contains(k)) {
                    cntr++;
                    k++;
                }
            }
            if(cntr>max){
                max=cntr;
            }
        }
        return max;
    }
}
