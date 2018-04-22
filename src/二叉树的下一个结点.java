/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class 二叉树的下一个结点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        //该节点是空节点
        if(pNode == null){
            return null;
        }
        //该节点有右子树，则下一个结点为右子树中最左边的节点
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while (node.left!=null){
                node = node.left;
            }
            return node;
        }
        //该节点没有右子树，向上找直到当前节点是父节点的左孩子
        if (pNode.right == null){
            TreeLinkNode node = pNode;
            while (node.next != null){
                if(node.next.left != node){
                    node = node.next;
                }
                else
                    return node.next;
            }
        }
        return null;
    }
}
