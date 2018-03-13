/**
 * 输入一个链表，从尾到头打印链表每个节点的值
 */

import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode walk = node;
        walk.next = new ListNode(2);
        walk = walk.next;
        walk.next = new ListNode(3);
        walk = walk.next;
        walk.next = new ListNode(4);
        ArrayList<Integer> list = printListFromTailToHead(node);
        for(Integer i:list){
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode pre = null, next = null;
        while (listNode.next != null) {
            next = listNode.next;
            listNode.next = pre;
            pre.next = listNode;
            listNode = listNode.next;
        }
        while (pre != null) {
            result.add(pre.val);
            pre = pre.next;
        }
        return result;
    }
}