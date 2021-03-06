import common.LeetCode;
import common.TreeNode;

/**
 * @author RakhmedovRS
 * @created 15-Mar-20
 */
@LeetCode(id = 103, name = "Maximum Depth of Binary Tree", url = "https://leetcode.com/problems/maximum-depth-of-binary-tree/")
public class MaximumDepthOfBinaryTree
{
	public int maxDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
	}
}
