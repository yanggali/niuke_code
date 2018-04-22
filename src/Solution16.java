/**
 * 反转链表
 * 题目描述：输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Solution16 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode walk = head,next,reverse = null;
        while (walk.next != null){
            next = walk.next;
            walk.next = reverse;
            reverse = walk;
            walk = next;
        }
        walk.next = reverse;
        return walk;
    }
}
