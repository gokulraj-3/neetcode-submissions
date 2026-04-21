// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> ans = new ArrayList();
        if (pairs.size() == 0) {
            return ans;
        }
        List<Pair> currentState = new ArrayList<>(pairs);
        ans.add(currentState);
        for (int i = 1; i<pairs.size(); i++){
            int j = i;
            while(j>0 && pairs.get(j).key<pairs.get(j-1).key ){
                Pair temp = pairs.get(j);
                pairs.set(j,pairs.get(j-1));
                pairs.set(j-1,temp);
                j--;
            }
            currentState = new ArrayList<>(pairs);
            ans.add(currentState);
        }
        return ans;
    }
}
