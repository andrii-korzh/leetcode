class LRUCache {
	Map<Integer, Integer> map;

	public LRUCache(int capacity) {
		map = new LinkedHashMap<Integer,Integer>( capacity, 0.75f, true) {
			protected boolean removeEldestEntry(Map.Entry eldest){
				return size() > capacity;
			}
		};
	}

	public int get(int key) {
		return map.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		map.put(key,value);
	}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */