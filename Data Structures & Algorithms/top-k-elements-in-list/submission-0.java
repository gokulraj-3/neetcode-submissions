class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap();
        for (int i:nums) {
            if(hs.containsKey(i)){
                hs.put(i, hs.get(i)+1);
            } else {
                hs.put(i,1);
            }
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        int cnt = 0;
        int[] res = new int[k];
        for (int i = freq.length-1; i>=0;i--) {
            for(int n:freq[i]) {
                res[cnt] = n;
                cnt++;
                if(cnt == k){
                    return res;
                }

            }
        }
        return res;
    }
}

