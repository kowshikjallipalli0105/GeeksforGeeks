class Solution {
  public:
  int convert(string &s){
      int hour = stoi(s.substr(0,2));
      int min = stoi(s.substr(3,2));
      int sec = stoi(s.substr(6,2));
      return ((hour*3600)+(min*60)+sec);
  }
    int minDifference(vector<string> &arr) {
        // code here
        vector<int>ans;
        for(int i=0;i<arr.size();i++){
            ans.push_back(convert(arr[i]));
        }
        sort(ans.begin(),ans.end());
        int mini = INT_MAX;
        for(int i=1;i<ans.size();i++){
            mini = min(mini,ans[i]-ans[i-1]);
        }
         int last =86400-(ans.back()-ans.front());
         mini = min(last,mini);
         return mini;
        
    }
};
