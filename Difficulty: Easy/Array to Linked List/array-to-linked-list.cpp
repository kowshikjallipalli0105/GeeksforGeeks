// User function Template for C++

/*class Node {
public:
    int data;
    Node* next;

    // Default constructor
    Node()
    {
        data = 0;
        next = NULL;
    }

    // Parameterised Constructor
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};*/

class Solution {
  public:
    Node* constructLL(vector<int>& arr) {
        // code here
        int n = arr.size();
        if( n ==0 ) return NULL;
        Node* head = new Node(arr[0]);
        Node* temp = head;
        for(int i=1;i<n;i++){
            temp->next = new Node(arr[i]);
            temp=temp->next;
            
        }
        return head;
    }
};