class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }
        return image;
    }

    private void dfs(int[][] image, int x, int y, int original, int color) {
        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length
            || image[x][y] != original) return;

        image[x][y] = color;

        dfs(image, x + 1, y, original, color);
        dfs(image, x - 1, y, original, color);
        dfs(image, x, y + 1, original, color);
        dfs(image, x, y - 1, original, color);
    }
}
