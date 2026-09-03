package Graphs.Medium;

public class NumberOfIslands_LC200 {
    int count = 0;
    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++){
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    count++;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int row, int col, int[][] visited) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return;
        if (visited[row][col]==1) return;
        if (grid[row][col] == '0') return;
        visited[row][col] = 1;
        dfs(grid,row+1,col,visited);
        dfs(grid,row-1,col,visited);
        dfs(grid,row,col+1,visited);
        dfs(grid,row,col-1,visited);
    }
}
