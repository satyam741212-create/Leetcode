/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
      if(head.next==null) return head; 
     ListNode node1=head;
     ListNode node2=head.next;
     while(node2 !=null){
        int gcd=gcd(node1.val,node2.val);
        ListNode gcdNode=new ListNode(gcd);
        node1.next=gcdNode;
        gcdNode.next=node2;
        node1=node2;
        node2=node2.next;
     }
     return head;
    }
    int gcd(int a,int b){
    int ans=0;
    for(int i=1;i<=a;i++){
        if(a%i==0 &&  b%i==0){
            ans=i;
        }
    }
    return ans;
    }
}