// User function Template for C++

class Solution {
  public:
    int toyCount(int N, int K, vector<int> arr) {
        // code here
        sort(arr.begin(),arr.end());
        int sum=0,cnt=0;
        for(int i=0;i<N;i++){
            if(sum+arr[i]<=K){
                cnt++;
                sum+=arr[i];
            }
            else{
                break;
            }
        }
        return cnt;
    }
};