package Trees.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class RightSideView_LC199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        if (root == null) return Collections.emptyList();
        res.add(root.val);
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                if(node.right !=  null) queue.offer(node.right);
                if(node.left !=  null) queue.offer(node.left);
            }
            if (queue.peek() != null) res.add(queue.peek().val);
        }
        return res;
    }
}
