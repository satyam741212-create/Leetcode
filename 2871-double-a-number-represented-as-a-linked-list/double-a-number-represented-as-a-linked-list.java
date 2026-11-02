class Solution {
    public ListNode doubleIt(ListNode head) {
    if(head.val>=5){
        ListNode newNode=new ListNode(0);
        newNode.next=head;
        head=newNode;
    }
    ListNode temp=head;
    while(temp!=null){
        temp.val=temp.val*2;
        if(temp.next!=null && temp.next.val>=5){
            temp.val++;
        }
        temp.val %=10;
        temp=temp.next;

    }
    return head;
    }
}