class Solution {
  public void rotate(int[] nums, int k) {
    if (true) {
      cyclicRotate(nums, k);
      return;
    }
    int ar[] = nums.clone();
    for (int i = 0; i < nums.length; i++) {
      int j = (i + k) % nums.length;
      nums[j] = ar[i];
    }
  }

  void cyclicRotate(int[] nums, int k) {
    k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }
  }

  void inPlace(int[] nums, int k) {
    while (k > 0) {
      int prev = nums[nums.length - 1];
      for (int i = 0; i < nums.length; i++) {
        int tmp = nums[i];
        nums[i] = prev;// 1,2,3,4,5 -> 5,1,2,3,4
        prev = tmp;
      }
      k--;
    }

//      int temp, previous;
//         for (int i = 0; i < k; i++) {
//             previous = nums[nums.length - 1];
//             for (int j = 0; j < nums.length; j++) {
//                 temp = nums[j];
//                 nums[j] = previous;
//                 previous = temp;
//             }
//         }
  }

  void swap(int[] ar, int i, int j) {
    int tmp = ar[i];
    ar[i] = ar[j];
    ar[j] = tmp;
  }
}