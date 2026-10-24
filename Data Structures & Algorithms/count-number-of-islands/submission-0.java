class Solution {
    class Pair
    {
        int row;
        int col;
        Pair(int row, int col)
        {
            this.row=row;
            this.col=col;
        }
    }

    public int numIslands(char[][] grid) 
    {
        int islands=0;

        Queue<Pair> q=new LinkedList<>();
        int[] dr={-1, 1, 0, 0};
        int[] dc={0, 0, -1, 1};

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    islands++;
                    q.offer(new Pair(i,j));
                    grid[i][j]='0';

                    while(!q.isEmpty())
                    {
                        Pair p=q.poll();
                        int row=p.row, col=p.col;
                        for(int k=0;k<4;k++)
                        {
                            int nr=row+dr[k], nc=col+dc[k];
                            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]=='0') continue;
                            else
                            {
                                q.offer(new Pair(nr, nc));
                                grid[nr][nc]='0';
                            }
                        }
                    }
                }
            }
        }
            return islands;
}
}
