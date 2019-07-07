class Solution {
	int intMax = (~0) >>> 1;
	int intMin = ~intMax;

	public int myAtoi(String str) {
		// System.out.println(intMin);
		// System.out.println(intMax);
		if (str == null) return 0;
		StringHelper sh = new StringHelper(str.toCharArray());
		CharHelper ch = new CharHelper();
		boolean isWhitespace = true;
		boolean isOptionalSign = true;
		boolean isAnything = false;
		long result = 0;
		int flag = 1;
		while (sh.hasNext()) {
			ch.set(sh.next());
			if (ch.isDigit()) {
				result *= 10;
				result += ch.getDigit() * flag;
				isWhitespace = false;
				isOptionalSign = false;
				isAnything = true;

				if (result > intMax) return intMax;
				if (result < intMin) return intMin;
			} else if (isAnything) {
				break;
			} else if (ch.isWhitespace()) {
				if (!isWhitespace) return 0;

			} else if (ch.isSign()) {
				if (!isOptionalSign) return 0;

				if (ch.isMinus()) flag = -1;
				isWhitespace = false;
				isOptionalSign = false;
				continue;
			} else {
				return 0;
			}
		}

		return (int) result;
	}


	class CharHelper {
		char s;

		void set(char s) {
			this.s = s;
		}

		boolean isDigit() {
			return s >= '0' && s <= '9';
		}

		int getDigit() {
			return s - '0';
		}

		boolean isSign() {
			return s == '-' || s == '+';
		}

		boolean isMinus() {
			return s == '-';
		}

		boolean isWhitespace() {
			return s == ' ';
		}
	}

	class StringHelper {
		final private char[] symbols;
		int index = -1;

		StringHelper(char[] symbols) {
			this.symbols = symbols;
		}

		boolean hasNext() {
			return index < symbols.length - 1;
		}

		char next() {
			index++;
			return symbols[index];
		}
	}
}