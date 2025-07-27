class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        if(mat == null || mat.length ==0 || mat[0].length ==0) return;
        int m = mat.length;
        int n = mat[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(row[i]){
                for(int j=0;j<n;j++){
                mat[i][j]=0;
            }
            }
        }
        for(int i=0;i<n;i++){
            if(col[i]){
                for(int j=0;j<m;j++){
                mat[j][i]=0;
            }
            }
        }
        
        
    }
}