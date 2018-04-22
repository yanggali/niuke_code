import java.util.ArrayList;
import java.util.Stack;

/**
 * 按之字形顺序打印二叉树
 */
public class 按之字形顺序打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        //奇数行和偶数行
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        int layer = 1;
        s1.push(pRoot);
        while (!s1.isEmpty()||!s2.isEmpty()){
            if ((layer & 1) == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.isEmpty()){
                    TreeNode t = s1.pop();
                    if (t!= null){
                        temp.add(t.val);
                        s2.push(t.left);
                        s2.push(t.right);
                    }
                }
                if (!temp.isEmpty()){
                    res.add(temp);
                    layer++;
                }
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.isEmpty()){
                    TreeNode t = s2.pop();
                    if (t != null){
                        temp.add(t.val);
                        s1.push(t.right);
                        s1.push(t.left);
                    }
                }
                if (!temp.isEmpty()){
                    res.add(temp);
                    layer++;
                }
            }
        }
        return res;
    }
}
