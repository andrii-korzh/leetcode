class Solution {
  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    List<Integer> digits = new ArrayList<>();
    while (!set.contains(n) && n != 1) {
      set.add(n);
      digits = getDigits(n, digits);
      n = sum(digits);
      digits.clear();
    }
    return n == 1;
  }

  int sum(List<Integer> list) {
    int sum = 0;
    for (int i : list) {
      sum += i * i;
    }
    return sum;
  }

  List<Integer> getDigits(int n, List<Integer> digits) {
    while (n > 0) {
      digits.add(n % 10);
      n /= 10;
    }
    return digits;
  }
}