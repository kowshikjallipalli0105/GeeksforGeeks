class Solution {
  public:
    bool isPalinSent(string &s) {
        // code here
        string res;
        for(char c:s){
            if(isalnum(c)){
                res+=tolower(c);
            }
        }
        int low=0;
        int high=res.length()-1;
        while(low<high){
            if(res[low]!=res[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
        
    }
};