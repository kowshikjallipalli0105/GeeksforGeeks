class Solution {
  public:
    bool checkEqual(vector<int>& a, vector<int>& b) {
        // code here
         unordered_map<int, int>map;
        
        for(auto i : a) map[i]++;
        
        for(auto i : b){
            if (!map.count(i)) return false;
            map[i]--;
            if(map[i]==0) map.erase(i);
        }
        return map.size()==0 ? true : false;
    }
};