class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    while( m > 0 && n > 0){
      int i = m - 1;
      int j = n - 1;
      int k = m + n - 1;
      if( nums1[i] > nums2[j]){
        nums1[k] = nums1[i];
        m--;
      } else {
        nums1[k] = nums2[j];
        n--;
      }
    }
    
    while( n > 0){
      nums1[n-1] = nums2[n-1];
      n--;
    }
  }
}
