import java.util.ArrayList;
import java.util.Stack;

public class Solution25 {
    ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return allPaths;
        }
        target -= root.val;
        path.add(root.val);
        //如果该节点是叶子结点，并且此时路径和为目标值，则把该路径存起来
        if(target == 0 && root.left == null && root.right == null){
            allPaths.add(new ArrayList<>(path));
        }
        //遍历左节点
        if(root.left != null){
            FindPath(root.left,target);
        }
        //遍历右节点
        if(root.right != null){
            FindPath(root.right,target);
        }
        //回到当前节点
        path.remove(path.size()-1);
        return allPaths;
    }
}
