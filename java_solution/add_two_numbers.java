package java_solution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 */

//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order, and each of their nodes contains a single digit. 
//Add the two numbers and return the sum as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int k = 0;
        int c = 1;
        int sum = 0;
        ListNode result = new ListNode();
        ListNode begin = result;
        while((l1!=null) || (l2!=null)){
            if(l1 == null){
                sum = l2.val + k;
            }
            else if(l2 == null){
                sum = l1.val + k;
            }
            else{
                sum = l1.val + l2.val + k;
            }
            k = 0;
            if(sum > 9){
                sum = sum - 10;
                k = 1;
            }
            if(c == 1){
                result.val = sum;
                c = 0;
            }
            else{
                ListNode add = new ListNode(sum);
                result.next = add;
                result = result.next;
            }
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 =l2.next;
            }     
        }
        
        if(k == 1){
            ListNode n = new ListNode(1);
            while(result.next!=null){
                result = result.next;
            }
            result.next = n;
            k = 0;
        }

        return begin;
    }
}
