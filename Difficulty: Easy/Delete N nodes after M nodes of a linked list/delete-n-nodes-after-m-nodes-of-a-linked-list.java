/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution {
    static void linkdelete(Node head, int N, int M) {
        Node current = head;

        while (current != null) {
            // Skip M-1 nodes (current is already the first one)
            for (int i = 1; i < M && current != null; i++) {
                current = current.next;
            }

            // If we reached the end, break
            if (current == null) return;

            // Start deleting from current.next
            Node temp = current.next;
            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }

            // Link M-th node to the node after N deleted nodes
            current.next = temp;

            // Move current to continue the process
            current = temp;
            
        }
    }
}