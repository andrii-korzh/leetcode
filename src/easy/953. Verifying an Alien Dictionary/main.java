class Solution {
	public boolean isAlienSorted(String[] words, String order) {
		Map<Character,Integer> m = new HashMap<>();
		for( int i = 0; i < order.length(); i++) m.put(order.charAt(i), i);
		for( int i = 0; i < words.length - 1; i++){
			if( !isValid(words[i], words[i+1], m)) return false;
		}

		return true;
	}

	boolean isValid(String w1, String w2, Map<Character,Integer> m) {
		int i = 0;
		int len = w1.length() < w2.length() ? w1.length() : w2.length();
		while( i < len) {
			int dif = m.get(w1.charAt(i)) - m.get(w2.charAt(i));
			if( dif > 0) return false;
			else if ( dif < 0) return true;
			i++;
		}

		return false;
	}
}