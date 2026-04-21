package Trees.Easy;

import javax.swing.tree.TreeNode;

public class DiameterOfBinaryTree_LC543 {
    int max_d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max_d;
    }
    public int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        max_d = Math.max(max_d,left+right);
        return Math.max(left,right)+1;
    }
}
