class Solution {
	public int maxProfit(int[] prices) {
		int total = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int sum = prices[i + 1] - prices[i];
			if (sum > 0) total += sum;
		}
		return total;
	}
}