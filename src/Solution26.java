import java.util.HashMap;

/**
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Solution26 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) return null;
        RandomListNode node = pHead;
        RandomListNode newNode = pHead;
        //为每个节点N复制节点N'并且连接在后面
        while (node != null){
            RandomListNode copy = new RandomListNode(node.label);
            copy.next = node.next;
            node.next = copy;
            node = copy.next;
        }
        //为复制节点N'设置random
        RandomListNode copyRandom;
        while (newNode != null) {
            if(newNode.random != null) {
                copyRandom = newNode.random.next;
                newNode.next.random = copyRandom;
            }
            newNode = newNode.next.next;
        }
        //将复制链表抽取出来

        RandomListNode newHead = pHead.next;
        RandomListNode newCopy = newHead;
        while (pHead != null) {
            pHead.next = pHead.next.next;
            if(newCopy.next != null){
                newCopy.next = newCopy.next.next;
            }
            pHead = pHead.next;
            newCopy = newCopy.next;
        }
        return newHead;
    }

    /**
     * 用map，空间换取时间
     * @param pHead
     * @return
     */
    public RandomListNode Clone1(RandomListNode pHead){
        if (pHead == null) {
            return null;
        }
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode head = pHead;
        RandomListNode newPrev = null;
        RandomListNode newHead = null;
        while (pHead != null) {
            RandomListNode newNode = new RandomListNode(pHead.label);
            map.put(pHead,newNode);
            pHead = pHead.next;
            if(newPrev == null){
                newHead = newNode;
            }
            else {
                newPrev.next = newNode;
            }
            newPrev = newNode;
        }
        RandomListNode curNode = head;
        RandomListNode newCurNode = newHead;
        while (curNode != null && newCurNode != null) {

            RandomListNode random = curNode.random;
            RandomListNode newRandom = map.get(random);
            newCurNode.random = newRandom;

            curNode = curNode.next;
            newCurNode = newCurNode.next;
        }
        return newHead;
    }
}
