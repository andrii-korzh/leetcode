class Solution {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);
		for( int stone : stones) pq.offer(stone);
		for( int i = 0; i < stones.length - 1; i++) pq.offer(pq.poll() - pq.poll());
		return pq.poll();
	}
}