/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

   public ListNode merge(ListNode a, ListNode b) {
      if (a == null) return b;
      if (b == null) return a;
      ListNode result = null;
      if (a.val < b.val) {
         result = a;
         result.next = merge(a.next, b);
      } else {
         result = b;
         result.next = merge(a, b.next);
      }
      return result;
   }

   public ListNode mergeKLists(ListNode[] lists) {
      if (lists.length == 0) return null;
      int n = lists.length;
      int k = n;
      while (k != 1) {
         int index = 0;
         for (int i = 0; i < k; i += 2) {
            if (i + 1 < k)
               lists[index++] = merge(lists[i], lists[i + 1]);
            else
               lists[index++] = lists[i];
         }
         k = index;
      }

      return lists[0];
   }
}
