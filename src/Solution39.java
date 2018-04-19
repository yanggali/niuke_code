import java.util.ArrayDeque;

/**
 * 二叉树的深度
 * 深度优先求每条路径的长度，返回最长的
 */
public class Solution39 {
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        ArrayDeque<TreeNode> path = new ArrayDeque<>();
        path.add(root);
        int depth = 0,max = 0;
        while (!path.isEmpty()){
            TreeNode temp = path.poll();
            depth ++;
            if(temp.left != null){
                path.add(temp.left);
            }
            if(temp.right != null){
                path.add(temp.right);
            }
            if(temp.left == null && temp.right == null){
                if(depth > max){
                    max = depth;
                }
                depth = 0;
            }
        }
        return max;
    }
}
