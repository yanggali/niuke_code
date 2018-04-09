
import java.util.*;

public class Solution23 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //从上到下，从右往左宽度优先遍历二叉树，将弹出的数存入栈，然后再弹出
        ArrayList<Integer> print = new ArrayList<>();
        if(root == null) return print;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            print.add(temp.val);
            if (temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        return print;
    }
}
