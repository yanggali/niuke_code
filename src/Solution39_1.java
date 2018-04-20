/**
 * 判断该树是否为平衡二叉树
 */
public class Solution39_1 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
        if(IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right)){
            if(Math.abs(depth(root.left)-depth(root.right)) <= 1){
                return true;
            }
        }
        return false;
    }
    public int depth(TreeNode root){
        if (root == null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }

}
