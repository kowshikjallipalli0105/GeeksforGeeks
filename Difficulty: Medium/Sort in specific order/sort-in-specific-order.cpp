class Solution {
  public:
    void sortIt(vector<int>& arr) {
        // code here
        vector<int>odd;
        vector<int>even;
        for(int i:arr){
            if(i%2!=0){
                odd.push_back(i);
            }
            else{
                even.push_back(i);
            }
        }
        sort(odd.begin(),odd.end(),greater<int>());
        sort(even.begin(),even.end());
        arr.clear();
        for(int i:odd){
            arr.push_back(i);
        }
        for(int i:even){
            arr.push_back(i);
        }
    }
};