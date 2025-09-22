class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return image; // nothing to change

        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        int row = image.length, col = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int x = node[0], y = node[1];

                                           // Color the current pixel
            image[x][y] = color;
            for (int[] dir : dirs) {
                int newX = x + dir[0], newY = y + dir[1];
                if (newX >= 0 && newX < row && newY >= 0 && newY < col
                    && image[newX][newY] == originalColor) {
                    q.add(new int[]{newX, newY});
                }
            }
        }
        return image;
    }
}
