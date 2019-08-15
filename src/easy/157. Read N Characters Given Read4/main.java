/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
	int k = 4;

	/**
	 * @param buf Destination buffer
	 * @param n   Maximum number of characters to read
	 * @return The number of characters read
	 */
	public int read(char[] buf, int n) {
		int total = 0;
		char[] tmp = new char[k];

		int count = k;
		while (count == k && total < n) {
			System.out.println("count:" + count + ",n - total:" + (n - total));
			count = Math.min(n - total, read4(tmp));
			for (int i = 0; i < count; i++) buf[total++] = tmp[i];
		}

		return total;
	}
}