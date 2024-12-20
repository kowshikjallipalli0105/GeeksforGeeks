//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    vector<int> spirallyTraverse(vector<vector<int> > &mat) {
        // code here
        int right=mat[0].size()-1;
        int bot=mat.size()-1;
        int left=0,top=0;
        vector<int>res;
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++){
                res.push_back(mat[top][i]);
                
            }
            top++;
            for(int i=top;i<=bot;i++){
                res.push_back(mat[i][right]);
            }
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--){
                    res.push_back(mat[bot][i]);
                }
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    res.push_back(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;

    while (t--) {
        int r, c;
        cin >> r >> c;
        vector<vector<int>> matrix(r);

        for (int i = 0; i < r; i++) {
            matrix[i].assign(c, 0);
            for (int j = 0; j < c; j++) {
                cin >> matrix[i][j];
            }
        }

        Solution ob;
        vector<int> result = ob.spirallyTraverse(matrix);
        for (int i = 0; i < result.size(); ++i)
            cout << result[i] << " ";
        cout << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends