class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        int time = 0; 
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                    fresh++;
                }
                if(grid[r][c] == 2){
                    q.add(new int[] {r,c});
                }
            }
        }
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh > 0){
            int length = q.size();
            for(int i = 0; i < length; i++){
                int[] node = q.poll();
                for(int[] dir : directions){
                    int nr = node[0] + dir[0];
                    int nc = node[1] + dir[1]; 

                    if(nr >= 0 && nc >= 0 && nr < grid.length &&
                      nc < grid[0].length && grid[nr][nc] == 1){
                        grid[nr][nc] = 2; 
                        q.add(new int[] {nr,nc});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1; 
    }
}
