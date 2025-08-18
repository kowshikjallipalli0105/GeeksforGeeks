class Solution {
  public:
    int missingNum(vector<int>& arr) {
          int n = arr.size()+1;
        long long sum = accumulate(arr.begin(),arr.end(),0LL);
        long long expected = (long long)n*(n+1)/2;
        return expected-sum;
    
    }
};