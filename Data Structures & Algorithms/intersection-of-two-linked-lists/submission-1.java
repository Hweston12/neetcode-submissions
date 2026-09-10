/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode cur = headA; 
        while(cur != null){
            seen.add(cur);
            cur = cur.next; 
        }

        cur = headB;
        while(cur != null){
            if(seen.contains(cur)){
                return cur; 
            }
            cur = cur.next; 
        }
        return null; 
    }
}