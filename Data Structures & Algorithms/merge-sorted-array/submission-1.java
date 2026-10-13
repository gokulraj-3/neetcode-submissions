class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1;
        int i2 = n-1;
        int pos = m+n-1;
        while(i1>=0 && i2>=0) {
            if(nums1[i1] >= nums2[i2]) {
                nums1[pos] = nums1[i1];
                pos--;
                i1--;
            } else {
                nums1[pos] = nums2[i2];
                pos--;
                i2--;
            }
        }
        while(i2>=0) {
            nums1[pos] = nums2[i2];
            pos--;
            i2--;
        } 
    }
}