class Solution {
	static final int A = 'A';
	static final int size = 'z' - 'A' + 1;

	public int numJewelsInStones(String J, String S) {
		int[] stones = new int[size];
		int counter = 0;
		for (int i = 0; i < S.length(); i++) stones[S.charAt(i) - A]++;
		for (int i = 0; i < J.length(); i++) counter += stones[J.charAt(i) - A];
		return counter;
	}
}