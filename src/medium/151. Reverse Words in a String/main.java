public class Solution {
	public String reverseWords(String s) {
		int l = getLeft(s);
		if (l == s.length()) return "";
		int h = getRight(s);

		Deque<Queue<Character>> words = new ArrayDeque();
		int i = l;
		while (i <= h) {
			Queue<Character> word = new LinkedList<>();
			while (i <= h && s.charAt(i) != ' ') {
				word.offer(s.charAt(i));
				i++;
			}
			words.push(word);
			while (i <= h && s.charAt(i) == ' ') {
				i++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (Queue<Character> q : words) {
			for (char c : q) {
				sb.append(c);
			}
			sb.append(' ');
		}

		return sb.deleteCharAt(sb.length() - 1).toString();
	}

	int getLeft(String s) {
		int i = 0;
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}

		return i;
	}

	int getRight(String s) {
		int i = s.length() - 1;
		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}

		return i;
	}

}