class Solution {
  public:
    int firstOccurence(string& txt, string& pat) {
        // code here
        int ind = txt.find(pat);
        return ind;
    }
};