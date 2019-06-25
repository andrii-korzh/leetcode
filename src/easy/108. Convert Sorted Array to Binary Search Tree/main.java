class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		return buildBST(0,nums.length-1,nums);
	}

	TreeNode buildBST(int l, int h, int[]ar){
		if(l == h) return new TreeNode(ar[l]);
		if(l > h) return null;

		int mid = (l + h)/2;
		TreeNode node = new TreeNode(ar[mid]);
		node.left = buildBST(l,mid-1,ar);
		node.right = buildBST(mid+1,h,ar);
		return node;
	}
}