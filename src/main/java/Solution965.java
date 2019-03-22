
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        if (root.left != null && root.right == null)
            return isUnivalTree(root.left) && root.val == root.left.val;
        if (root.left == null)
            return isUnivalTree(root.right) && root.val == root.right.val;
        return isUnivalTree(root.left) &&
                isUnivalTree(root.right) &&
                root.val == root.left.val && root.val == root.right.val;
    }

}
