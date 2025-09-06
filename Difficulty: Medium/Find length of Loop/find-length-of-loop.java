/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int count(Node slow){
        int counter=1;
        Node temp = slow;
        while(temp.next!=slow){
            counter++;
            temp=temp.next;
        }
        return counter;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return count(slow);
            }
        }
        return 0;
    }
}