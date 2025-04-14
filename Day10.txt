2095. Delete the Middle Node of a Linked List
link -->https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

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
    public ListNode deleteMiddle(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        if(count==1){
            return null;
        }
        if (count / 2 >= 2) {
            for (int i = 0; i <= (count / 2) - 2; i++) {
                temp1 = temp1.next;
            }
            temp1.next = temp1.next.next;
        }
        else{
           ListNode temp2=head;
            temp2.next=temp2.next.next;
        }
        return head;
    }
}