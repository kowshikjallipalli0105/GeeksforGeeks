class Solution {
  public:
    long long maxSum(vector<int>& arr) {
        // code here
        long long ans=0;
        int st=0;
        int end = arr.size()-1;
        sort(arr.begin(),arr.end());
        while(st<end){
            ans+=(arr[end]-arr[st]);
            st++;
            end--;
        }
        ans*=2;
        return ans;
    }
};
