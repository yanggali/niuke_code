/**
 * 链表中环的入口
 * 题目描述：一个链表中包含环，请找出该链表的环的入口结点。
 */
public class 环的入口 {
    public static void main(String[] args) {
//        ListNode
//        环的入口 s = new 环的入口();
//        System.out.println();
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null || pHead.next == null || pHead.next.next == null) {
            return null;
        }
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        while (fast != slow) {
            if (fast.next.next != null && slow.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            else {
                return null;
            }
        }
        slow = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
