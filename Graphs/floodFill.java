package Graphs;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int num = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        boolean[][] vis = new boolean[image.length][image[0].length];
//        int num = image[sr][sc];
        helper(image, num, newColor, vis, sr, sc, m, n);
        return image;
    }

        void helper(int[][] image, int num, int color, boolean[][] vis, int i, int j, int m, int n){
        if( i >= m || j >= n || i < 0 || j < 0 || vis[i][j] || image[i][j] != num)
            return;

        image[i][j] = color;
        vis[i][j] = true;

        helper(image, num, color, vis, i+1, j, m, n);
        helper(image, num, color, vis, i-1, j, m, n);
        helper(image, num, color, vis, i, j+1, m, n);
        helper(image, num, color, vis, i, j-1, m, n);

    }
}
