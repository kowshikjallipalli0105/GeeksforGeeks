class Solution {
  public:
    // Function to find common elements in three arrays.
    vector<int> commonElements(vector<int> &arr1, vector<int> &arr2,
                               vector<int> &arr3) {
        // Code Here
        set<int>s2(arr2.begin(),arr2.end());
        set<int>s3(arr3.begin(),arr3.end());
        set<int>seen;
        vector<int> res;
        for(int i:arr1){
            if(s2.count(i) && s3.count(i) && !seen.count(i)){
                res.push_back(i);
                seen.insert(i);
            }
        }
        
        if(res.empty()){
            res.push_back(-1);
        }
        return res;
        
    }
};