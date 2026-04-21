class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){
            return "";
        }
        String res = "";
        for (String i:strs){
            res=res+i.length();
            res=res+"#";
            res=res+i;
        }
        return res;
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<String>();        
        }
        List<String> res=new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            res.add(str.substring(j+1,j+1+length));
            i = j+length+1;
        }
        return res;
    }
}
