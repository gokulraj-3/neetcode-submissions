class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i:nums) {
            hs.put(i, hs.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        for (int j=0;j < nums.length+1;j++) {
            arr[j] = new ArrayList<>();
        }
        for (int l : hs.keySet()) {
            arr[hs.get(l)].add(l);
        }
        int[] ans = new int[k];
        int n = 0;
        for(int m = arr.length-1; m >= 0;m--){
            ArrayList<Integer> val = arr[m];
            for(int p:val) {
                if (n==k) {
                    break;
                }
                ans[n]=p;
                n++;
            }
        }
        return ans;
    }
}
