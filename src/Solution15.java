public class Solution15 {
    public static void main(String[] args) {

    }
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = 0;
        ListNode walk = head;
        while(walk!=null){
            len++;
            walk = walk.next;
        }
        if(k > len) return null;
        int t = 0;
        walk = head;
        while(t++ < len-k){
            walk = walk.next;
        }
        return walk;
    }
    public ListNode FindKthToTail1(ListNode head,int k) {
        if (head == null || k == 0){
            return null;
        }
        ListNode ahead = head;
        //ahead和behind的距离相差k-1（ahead最后在尾部）
        for (int i = 0; i < k - 1; i++) {
            //预防k大于链表长度的情况
            if (ahead.next != null)
                ahead = ahead.next;
            else return null;
        }
        ListNode behind = head;
        while(ahead.next != null){
            ahead = ahead.next;
            behind = behind.next;
        }
        return behind;
    }
}
