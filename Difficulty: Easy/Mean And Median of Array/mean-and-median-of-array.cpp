class Solution {
  public:
    int mean(vector<int>& arr) {
        // code here
        int n = arr.size();
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        return sum/n;
    }

    int median(vector<int>& arr) {
        
        // code here
        sort(arr.begin(),arr.end());
        int n = arr.size();
        int req=0;
        if(n%2!=0) return arr[n/2];
        else{
            req =arr[n/2]+arr[n/2-1];
            // return 
            
        }
        return req/2;
        
    }
};
