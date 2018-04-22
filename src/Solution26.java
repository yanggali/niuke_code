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
//        RandomListNode pCur = pHead;
//        RandomListNode head = pHead.next;
//        RandomListNode cur = head;
//        pCur = pHead;
//        //拆分链表
//        while(pCur!=null){
//            pCur.next = pCur.next.next;
//            if(cur.next!=null)
//                cur.next = cur.next.next;
//            cur = cur.next;
//            pCur = pCur.next;
//        }
//        return head;
        RandomListNode pCur = pHead;
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
    public void copyNode(RandomListNode node){
        while (node != null){
            RandomListNode copy = new RandomListNode(node.label);
            copy.next = node.next;
            node.next = copy;
            node = copy.next;
        }
    }

    public void setRandom(RandomListNode node) {
        RandomListNode copyRandom;
        while (node != null) {
            copyRandom = node.random.next;
            node.next.random = copyRandom;
            node = node.next.next;
        }
    }

    public RandomListNode split(RandomListNode node) {
        RandomListNode newNext;
        RandomListNode newHead = new RandomListNode(0);
        RandomListNode newNode = newHead;
        while (node != null) {
            newNode = node.next;
            node.next = newNode.next;
            newNext = node.next.next;
            newNode.next = newNext;

            node = node.next;
        }
        return newHead;
    }
}
