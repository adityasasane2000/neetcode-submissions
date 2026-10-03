class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while(j<n){
            while(i<m){
                if(nums2[j] < nums1[i]){
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }
                i++;
            }
            nums1[m++] = nums2[j];
            j++;
            i = 0;
        }
    }
}

