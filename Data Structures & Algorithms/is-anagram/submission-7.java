class Solution {
    public boolean isAnagram(String s, String t) {
        return anaS(s).equals(anaS(t));
    }

    public String anaS(String val) {
        int[] arr = new int[26];
        for(char c: val.toCharArray()) {
            arr[(c-'a')]++;
        }
        return Arrays.toString(arr);
    }
}
