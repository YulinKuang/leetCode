package no897;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
        inOrder(root, nodeList);
        int nNode = nodeList.size();
        for (int i = 0; i < nNode - 1; i++) {
            TreeNode node = nodeList.get(i);
            node.left = null;
            node.right = nodeList.get(i + 1);
        }
        TreeNode lastNode = nodeList.get(nNode - 1);
        lastNode.left = null;
        lastNode.right = null;
        return nodeList.get(0);
    }

    private void inOrder(TreeNode root, ArrayList<TreeNode> nodeList) {
        if(root == null) return;
        inOrder(root.left, nodeList);
        nodeList.add(root);
        inOrder(root.right, nodeList);
    }
}
