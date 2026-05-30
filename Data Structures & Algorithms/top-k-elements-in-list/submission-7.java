class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] arr = new ArrayList[nums.length + 1];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int j:hm.keySet()){
            int freq = hm.get(j);
            if (arr[freq] == null) arr[freq] = new ArrayList<>();
            arr[freq].add(j);
        }
        int[] ans = new int[k];
        int cnt = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == null) continue;
            for(int p:arr[i]) {
                ans[cnt] = p;
                cnt++;
                if(cnt == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}
