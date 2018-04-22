/**
 * 对称的二叉树
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class 对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null || (pRoot.left == null && pRoot.right == null)){
            return true;
        }
        return isSymme(pRoot.left,pRoot.right);
    }
    //判断两个子树是否对称
    boolean isSymme(TreeNode left,TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val && isSymme(left.left,right.right) && isSymme(left.right,right.left);
    }
}
