class Solution {
  int zero = '0';

  public String addStrings(String num1, String num2) {
    if (num1.length() > num2.length()) {
      return add(num1, num2);
    }

    return add(num2, num1);
  }

  String add(String s1, String s2) {
    int n = s1.length() - 1;
    int m = s2.length() - 1;

    char[] str = new char[s1.length()];
    boolean extra = false;
    while (m >= 0) {
      int x = s1.charAt(n) - zero;
      int z = s2.charAt(m) - zero;
      int sum = x + z;
      if (extra) {
        sum++;
        extra = false;
      }
      if (sum > 9) {
        sum -= 10;
        extra = true;
      }
      str[n] = (char) (sum + zero);
      m--;
      n--;
    }

    while (n >= 0) {
      char c = s1.charAt(n);
      if (extra) {
        if (c == '9') {
          str[n] = '0';
        } else {
          extra = false;
          str[n] = (char) (c + 1);
        }
      } else {
        str[n] = c;
      }
      n--;
    }
    if (extra) {
      return "1" + new String(str);
    }

    return new String(str);
  }
}