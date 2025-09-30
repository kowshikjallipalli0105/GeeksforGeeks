class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> s = new Stack<>();
        while(q.size()>0){
            s.push(q.poll());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        
    }
}