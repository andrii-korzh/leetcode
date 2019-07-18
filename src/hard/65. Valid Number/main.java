//65. Valid Number 
//https://leetcode.com/problems/valid-number/
/*
Validate if a given string can be interpreted as a decimal number.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
" -90e3   " => true
" 1e" => false
"e3" => false
" 6e-1" => true
" 99e2.5 " => false
"53.5e93" => true
" --6 " => false
"-+3" => false
"95a54e53" => false

Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one. However, here is a list of characters that can be in a valid decimal number:

Numbers 0-9
Exponent - "e"
Positive/negative sign - "+"/"-"
Decimal point - "."
Of course, the context of these characters also matters in the input.

Update (2015-02-10):
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button to reset your code definition.	
*/
class Solution {
  public boolean isNumber(String s) {
    int l = left(s);
    if( l == s.length()) return false;

    int h = right(s);
    boolean isNumber = false;
    boolean isDigitAfterE = true;
    boolean isExp = false;
    boolean isPoint = false;
    for( int i = l; i <= h; ++i ) {
      char c = s.charAt(i);
      if( isDigit(c)) {
        isDigitAfterE = true;
        isNumber = true;
      } else if( isPoint(c)) {
        if( isPoint || isExp) return false;
        isPoint = true;
      } else if( isExp(c)) {
        if( isExp || !isNumber) return false;
        isDigitAfterE = false;
        isExp = true;
      } else if( isMinus(c) || isPlus(c) ) {
        if( i != l && !isExp(s.charAt(i-1)) ) return false;
      } else {
        return false;
      }
    }
    return isNumber && isDigitAfterE;
  }

  int left(String s) {
    int l = 0;
    while( l < s.length() && isSpace(s.charAt(l))) l++;
    return l;
  }

  int right(String s) {
    int h = s.length() - 1;
    while( h >= 0 && isSpace(s.charAt(h))) h--;
    return h;
  }

  boolean isDigit(char c) {
   return c >= '0' && c <= '9';
  }

  boolean isPlus(char c) {
    return c == '+';
  }

  boolean isMinus(char c) {
    return c == '-';
  }

  boolean isExp(char c) {
    return c == 'e';
  }

  boolean isPoint(char c) {
    return c == '.';
  }

  boolean isSpace(char c) {
    return c == ' ';
  }
}
