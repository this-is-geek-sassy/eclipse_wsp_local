package tree.node;

public class BinaryTreeNode {
	
	public int val;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	BinaryTreeNode() {}
	
	public BinaryTreeNode(int val) { this.val = val; }
	
	public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
