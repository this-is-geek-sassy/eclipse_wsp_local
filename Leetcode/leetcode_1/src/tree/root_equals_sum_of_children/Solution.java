package tree.root_equals_sum_of_children;

import tree.node.BinaryTreeNode;

// link to the problem: https://leetcode.com/problems/root-equals-sum-of-children/


public class Solution {
	
	public boolean checkTree(BinaryTreeNode root) {
        if ((root.left.val + root.right.val) == root.val)
            return true;
        return false;
    }

}
