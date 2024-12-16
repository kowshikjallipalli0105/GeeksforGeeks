//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    vector<int> lcmAndGcd(long long a , long long b) {
        // code here
        long long gcd =findgcd(a,b);
        long long lcm=(a/gcd)*b;
        return {lcm,gcd};
        
    }
    public:
    long long findgcd(long long a,long long b){
        if(a==0) return b;
        return findgcd(b%a,a);
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        int A, B;

        cin >> A >> B;

        Solution ob;
        vector<int> ans = ob.lcmAndGcd(A, B);
        cout << ans[0] << " " << ans[1] << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends