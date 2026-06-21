//Time Complexity: O(n*m) for constructor and O(1) for sumRegion
//Space Complexity: O(n*m) for prefix sum array
class NumMatrix {
    int prefix[][];
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        prefix=new int[n][m];
        prefix[0][0]=matrix[0][0];
        for(int j=1;j<m;j++){
            prefix[0][j]=prefix[0][j-1]+matrix[0][j];
        }
        for(int i=1;i<n;i++){
            prefix[i][0]=prefix[i-1][0]+matrix[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int top=prefix[i-1][j];
                int left=prefix[i][j-1];
                int top_left=prefix[i-1][j-1];
                int curr=matrix[i][j];
                prefix[i][j]=curr+top+left-top_left;
            }
        }


    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int n=prefix.length;
        int m=prefix[0].length;
        int curr=prefix[row2][col2];
        int left=0;
        if(col1>0)
            left=prefix[row2][col1-1];
        int top=0;
        if(row1>0)
            top=prefix[row1-1][col2];
        int top_left=0;
        if(row1>0 && col1>0)
           top_left=prefix[row1-1][col1-1];
        int sum=(curr+top_left)-top-left;
        return sum;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */