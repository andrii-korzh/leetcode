public class Solution {
	public int maxProfit(int prices[]) {
		int min = -1 >>> 1;
		int deal = 0;
		for (int i = 0; i < prices.length; i++) {
			if (min > prices[i]) {
				min = prices[i];
			} else {
				int newDeal = prices[i] - min;
				if (deal < newDeal) deal = newDeal;
			}

		}
		return deal;
	}
}