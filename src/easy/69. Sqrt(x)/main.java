class Solution {
  public int mySqrt(int x) {
    if (x == 0) return 0;
    
    int left = 1, right = x;
    while (true) {
      int mid = left + (right - left)/2;
      if (mid > x/mid) right = mid - 1;
      else {
        mid++;
        if (mid > x/mid) return mid - 1;
        left = mid;
      }
    }
    // return 
  }
}
