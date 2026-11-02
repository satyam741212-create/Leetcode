class Solution {
    public ListNode mergeNodes(ListNode head) {
         ListNode temp=head;
         int sum=0;
         ListNode dummy=new ListNode(0);
         ListNode curr=dummy;
         while(temp!=null){
            if(temp.val!=0){
                  sum +=temp.val;
            }
            else if(sum !=0){
                  ListNode newNode=new ListNode(sum);
                    curr.next=newNode;
                    curr=curr.next;
                     sum=0;
            }       
            temp=temp.next;
         }
         return dummy.next;
    }
}