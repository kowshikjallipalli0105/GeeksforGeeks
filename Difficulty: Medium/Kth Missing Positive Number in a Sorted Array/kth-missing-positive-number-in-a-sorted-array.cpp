//{ Driver Code Starts
// Initial function template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    int kthMissing(vector<int> &arr, int k) {
        // Your code goes here
        map<int,int>mp;       // map to store numbers 
        for(int i=0;i<arr.size();i++){
            mp[arr[i]]++;
        }
        int n=arr.size();
        int m=arr[n-1];  // largest positive number in the array as it is sorted
        for(int i=1;i<m+1;i++){     // check for missing numbers
            if(mp.find(i)==mp.end()){
                --k;
                if(k==0){
                    return i;
                }
            }
        }
        return m+k;  
    }
};

//{ Driver Code Starts.

int main() {
    int test_case;
    cin >> test_case;
    cin.ignore();
    while (test_case--) {

        int d;
        vector<int> arr, brr, crr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        getline(cin, input);
        ss.clear();
        ss.str(input);
        while (ss >> number) {
            crr.push_back(number);
        }
        d = crr[0];
        int n = arr.size();
        Solution ob;
        int ans = ob.kthMissing(arr, d);
        cout << ans << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends