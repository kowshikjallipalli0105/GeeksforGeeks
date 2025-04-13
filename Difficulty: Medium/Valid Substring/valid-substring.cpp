//{ Driver Code Starts
// Initial template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    int maxLen(string& s) {
        // code here
        stack<int>st;
        st.push(-1);
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s[i]=='(') st.push(i);
            else{
                st.pop();
                if(!st.empty()){
                    cnt=max(cnt,i-st.top());
                    
                }else st.push(i);
            }
        }
        return cnt;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S;
        Solution ob;
        cout << ob.maxLen(S) << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends