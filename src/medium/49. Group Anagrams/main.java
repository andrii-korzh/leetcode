class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> r = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (String word : strs) {
			char[] x = word.toCharArray();
			Arrays.sort(x);
			String key = new String(x);
			List<String> temp = map.containsKey(key) ? map.get(key) : new ArrayList<>();
			temp.add(word);
			map.put(key, temp);
		}

		for (String key : map.keySet()) r.add(map.get(key));
		return r;
	}
}