public class SwapNodes {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node= head;
        if(head.next!=null){
            head=head.next;
        }
        while(node.next!=null){
            ListNode temp=node.next;
            ListNode nextNode;
            if(temp.next!=null){
                nextNode=temp.next;
                if(temp.next.next!=null){
                    node.next=temp.next.next;
                }
                else{
                    node.next=temp.next;
                }
                temp.next=node;
            }
            else{
                temp.next=node;
                node.next=null;
                nextNode=node;
            }
            node=nextNode;
        }
        return head;
}
}
