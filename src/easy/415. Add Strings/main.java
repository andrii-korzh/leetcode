class Solution {

  SumHandler sumHandler = new SumHandler();

  public String addStrings(String num1, String num2) {
    if (num1.length() > num2.length()) return sumHandler.addNumbers(num1, num2);

    return sumHandler.addNumbers(num2, num1);
  }

  static class SumHandler {
    static int ZERO = '0';
    int longNumIndex;
    int shortNumIndex;
    char[] buffer;
    boolean extra;

    String addNumbers(String longNum, String shortNum) {
      longNumIndex = longNum.length() - 1;
      shortNumIndex = shortNum.length() - 1;
      buffer = new char[longNum.length()];
      extra = false;

      add(longNum, shortNum);
      add(longNum);
      if (extra) {
        return "1" + new String(buffer);
      }

      return new String(buffer);
    }

    private void add(String number) {
      while (longNumIndex >= 0) {
        char c = number.charAt(longNumIndex);
        if (extra) {
          if (c == '9') {
            str[longNumIndex] = '0';
          } else {
            extra = false;
            str[longNumIndex] = (char) (c + 1);
          }
        } else {
          str[longNumIndex] = c;
        }
        longNumIndex--;
      }
    }

    private void add(String number1, String number2) {
      while (m >= 0) {
        int sum = number1.charAt(longNumIndex) - ZERO + number2.charAt(shortNumIndex) - ZERO;
        if (extra) {
          sum++;
          extra = false;
        }
        if (sum > 9) {
          sum -= 10;
          extra = true;
        }
        buffer[n] = (char) (sum + ZERO);
        shortNumIndex--;
        longNumIndex--;
      }
    }
  }
}