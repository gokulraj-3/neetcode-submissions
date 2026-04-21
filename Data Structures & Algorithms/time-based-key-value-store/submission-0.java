class TimeMap {
    HashMap<String, List<String[]>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        String[] entry = {String.valueOf(timestamp), value};
        if(map.get(key) == null) {
            List<String[]> list = new ArrayList<>();
            list.add(entry);
            map.put(key, list);
        } else {
            map.get(key).add(entry);
        }
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<String[]> arr = map.get(key);
        int l = 0;
        int h = arr.size() - 1;
        String res = "";
        while(l <= h) {
            int m = l + (h - l) / 2;
            if (Integer.parseInt(arr.get(m)[0]) <= timestamp) {
                res = arr.get(m)[1];
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return res;
    }
}