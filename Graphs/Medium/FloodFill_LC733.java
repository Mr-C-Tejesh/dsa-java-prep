package Graphs.Medium;

public class FloodFill_LC733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visited = new int[image.length][image[0].length];
        int oldcolor = image[sr][sc];
        dfs(image,sr,sc,visited,oldcolor,color);
        return image;
    }
    public void dfs(int[][] image,  int row, int col, int[][] visited, int oc, int nc) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) return;
        if (visited[row][col] == 1) return;
        if (image[row][col] == nc) return;
        if (image[row][col] != oc) return;
        image[row][col] = nc;
        dfs(image,row-1,col,visited,oc,nc);
        dfs(image,row+1,col,visited,oc,nc);
        dfs(image,row,col-1,visited,oc,nc);
        dfs(image,row,col+1,visited,oc,nc);
    }
}
