class Solution {
    private final static int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length; 
        int COLS = grid[0].length;
        int area = 0; 
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(grid[r][c] == 1){
                    area = Math.max(area, recursiveDFS(grid,r,c));
                }
            }
        }
        return area; 
    }

    private int bfs(int[][] grid, int r, int c){
        Queue<int[]> q = new ArrayDeque<>();
        grid[r][c] = 0; 
        q.add(new int[] {r,c});
        int res = 1; 

        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0];
            int col = node[1]; 

            for(int[] dir : directions){
                int nr = row + dir[0];
                int nc = col + dir[1];

                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length &&
                   grid[nr][nc] == 1){
                    grid[nr][nc] = 0;
                    q.add(new int[] {nr,nc});
                    res++; 
                }
            }
        }
        return res; 
    }

    private int dfs(int[][] grid, int r, int c){
        Deque<int[]> stack = new ArrayDeque<>();
        grid[r][c] = 0;
        stack.push(new int[] {r,c});
        int res = 1; 

        while(!stack.isEmpty()){
            int[] node = stack.pop();
            int row = node[0];
            int col = node[1]; 

            for(int[] dir : directions){
                int nr = row + dir[0];
                int nc = col + dir[1]; 

                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length &&
                   grid[nr][nc] == 1){
                    grid[nr][nc] = 0;
                    stack.push(new int[] {nr,nc});
                    res++; 
                }
            }
        }
        return res; 
    }

    private int recursiveDFS(int[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || 
           grid[r][c] == 0){
            return 0; 
        }
        int res = 1; 
        grid[r][c] = 0;
        for(int[] dir : directions){
            res += recursiveDFS(grid,r + dir[0], c + dir[1]);
        }
        return res; 
    }
}
