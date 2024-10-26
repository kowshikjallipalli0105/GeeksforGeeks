//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}


// } Driver Code Ends
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        Node temp=head;
        while(temp!=null){
            ans.add(temp.data);
            temp=temp.next;
        }
        Map<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < ans.size(); i++) {
        mp.put(ans.get(i), mp.getOrDefault(ans.get(i), 0) + 1);
    }

    // Return the count for the given key if present
    return mp.getOrDefault(key, 0);
    }
}

//{ Driver Code Starts.

class LinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            int key = Integer.parseInt(br.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(head, key));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends