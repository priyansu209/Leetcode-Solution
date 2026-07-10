class Pair{
    int r;
    int c;
    public Pair(int r, int c){
        this.r=r;
        this.c=c;
    }
}
class Solution {
    int [] X={-1,1,0,0};
    int [] Y={0,0,-1,1};
    public boolean Valid(int i, int j, int n, int m){
         if(i<0||i>=n || j<0||j>=m){
            return false;
         }
         return true;
    }
    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        
        Queue<Pair> q= new LinkedList<>();
        int fresh=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                    grid[i][j]=-1;
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int time=0;

        while(!q.isEmpty() && fresh>0){
            time++;
            int size=q.size();
            while(size-->0){
                Pair rotten=q.peek();
                q.poll();
                int row=rotten.r;
                int col=rotten.c;
                for(int i=0;i<4;i++){
                    int r=row+ X[i];
                    int c=col+ Y[i];

                    if(Valid(r,c,n,m)&& grid[r][c]==1){
                        grid[r][c]=-1;
                        q.offer(new Pair(r,c));
                        fresh--;
                    }
                }
            }
        
        }

        if(fresh>0){
            return -1;
        }
        return time;

        
    }
}