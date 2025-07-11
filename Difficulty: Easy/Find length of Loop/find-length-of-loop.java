/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countcycle(Node slow){
        Node temp = slow;
        int count=1;
        while(temp.next!=slow){
            count++;
            temp =temp.next;
        }
        return count;
    }
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return countcycle(slow);
                
            }
    }
        return 0;
}
}