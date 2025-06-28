class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int result []=new int[m+n];
        int indx=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j]){
                result[indx++]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                result[indx++]=nums2[j];
                j++;
            }
            else{
                result[indx++]=nums1[i];
                result[indx++]=nums2[j];
                i++;j++;
            }
        }
        while(i<m){
            result[indx++]=nums1[i];
            i++;
        }
        while(j<n){
            result[indx++]=nums2[j];
            j++;
        }
        for(int k=0;k<result.length;k++)
        {
            nums1[k]=result[k];
        }

    }
}