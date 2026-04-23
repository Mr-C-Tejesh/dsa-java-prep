package Trees.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrderTraversal_LC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return Collections.emptyList();
        List<Integer> rr = new ArrayList<>(); rr.add(root.val);
        queue.offer(root);
        res.add(rr);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> r = new ArrayList<>();
            for (int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    r.add(node.left.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    r.add(node.right.val);
                }
            }
            if(r.size() != 0) res.add(r);
        }
        return res;
    }
}
