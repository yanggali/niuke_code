public class Solution37 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        ListNode b = a.next.next;
        System.out.println(FindFirstCommonNode(a,b).val);
    }
    public static int linklistLen(ListNode node){
        if(node == null) return 0;
        int len = 0;
        while(node != null){
            len ++;
            node = node.next;
        }
        return len;
    }
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int listLen1 = linklistLen(pHead1);
        int listLen2 = linklistLen(pHead2);
        if(listLen1 == 0||listLen2 == 0){
            return null;
        }
        if(listLen1 < listLen2){
            int i = 0 ;
            while(i++ < listLen2 - listLen1){
                pHead2 = pHead2.next;
            }
        }
        else{
            int j = 0;
            while(j++ < listLen1 - listLen2){
                pHead1 = pHead1.next;
            }
        }
        int k = 0,min = listLen1 > listLen2 ? listLen2 : listLen1;
        while(k++ < min && pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        if(k <= min) return pHead1;
        else return null;
    }
}
