//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    int lenOfLongSubarr(int A[],  int n, int k) 
    { 
        // Complete the function
        unordered_map<long long,int>prefixs;
        int maxlen=0;
        long long sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i];
            if(sum==k){
                maxlen=max(maxlen,i+1);
            }
            long long rem=sum-k;
            if(prefixs.find(rem)!=prefixs.end()){
                int len=i-prefixs[rem];
                maxlen=max(len,maxlen);
            }
            if(prefixs.find(sum)==prefixs.end()){
                prefixs[sum]=i;;
            }
        }
        return maxlen;
    }
};

//{ Driver Code Starts.

int main() {
	//code
	
	int t;cin>>t;
	while(t--)
	{
	    int n, k;
	    cin>> n >> k;
	    int a[n];
	    
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	   Solution ob;
	   cout << ob.lenOfLongSubarr(a, n , k)<< endl;
	    
	}
	
	return 0;
}
// } Driver Code Ends