class Solution {
  public:
    int removeDuplicates(vector<int> &arr) {
        // code here
       if (arr.empty()) return 0;
    
    sort(arr.begin(), arr.end()); // Required for unique to work properly
    auto it = unique(arr.begin(), arr.end()); // Moves duplicates to the end
    arr.erase(it, arr.end()); // Erase the duplicates
    
    return arr.size();
        
    }
};