/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return constructBinaryTree(pre, 0,pre.length-1, in,0,in.length-1);
    }
    public TreeNode constructBinaryTree(int[] pre,int preS,int preE,int[] in,int inS,int inE){
        if(preE < preS || inE < inS) return null;
        TreeNode root = new TreeNode(pre[preS]);
        int mid;
        for(mid = inS;mid <= inE;mid++){
            if(in[mid] == pre[preS]){
                root.left = constructBinaryTree(pre,preS+1,mid-inS+preS,in,inS,mid-1);
                root.right = constructBinaryTree(pre,mid-inS+preS+1,preE,in,mid+1,inE);
                break;
            }
        }
        return root;
    }
}