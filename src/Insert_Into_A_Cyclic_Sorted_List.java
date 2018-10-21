/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Solution {
   public Node insert(Node head, int insertVal) {
      Node toInsert = new Node(insertVal);
      if (head == null) {
         head = new Node(insertVal, null);
         head.next = head;
         return head;
      }

      boolean inserted = false;      
      Node prev = head;
      Node curr = head.next;

      while (true) {
         if ((prev.val <= insertVal && insertVal <= curr.val) ||
             (prev.val > curr.val && insertVal > prev.val) ||
             (prev.val > curr.val && insertVal > prev.val)) {
            prev.next = new Node(insertVal, curr);
            inserted = true;
            break;
         }
         prev = curr;
         curr = curr.next;
         if (prev == head) break;
      }
      if (!inserted) {
         prev.next = new Node(insertVal, curr);
      }

      return head;
   }
}
