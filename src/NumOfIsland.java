public class NumOfIsland {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int numOfIsland = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i<n ;i++){
            for(int j = 0; j<m;++j){
                if(grid[i][j] == '1'){
                    numOfIsland++;
                    recursion(grid, i, j);
                }
            }
        }
        return numOfIsland;
    }

    public void recursion(char [][]grid, int i, int j){
        int n = grid.length, m = grid[0].length;
        if(i<0 || j<0 || i>n-1 || j>m-1 || grid[i][j] == '0') return;
        grid[i][j] = '0';
        recursion(grid, i + 1, j);
        recursion(grid, i, j + 1);
        recursion(grid, i - 1, j);
        recursion(grid, i, j - 1);
    }
}

