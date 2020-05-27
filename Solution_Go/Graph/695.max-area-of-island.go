func maxAreaOfIsland(grid [][]int) int {
var result,max int
    for i:=0;i<len(grid);i++{
        for j:=0;j<len(grid[i]);j++{
            if grid[i][j] == 1{
                dfs(grid,i,j,&result)
                if result>max{
                    max = result
                }
                result=0
            }
        }
    }

    return max

}

func dfs(grid [][]int,i,j int, result *int){
    grid[i][j] = 0
    *result += 1
    if i-1>=0 && grid[i-1][j]==1 {
        dfs(grid,i-1,j,result)
    }
    if i+1<len(grid) && grid[i+1][j] == 1 {
        dfs(grid,i+1,j,result)
    }
    if j-1>=0 &&grid[i][j-1] == 1 {
        dfs(grid,i,j-1,result)
    }
    if j+1<len(grid[i]) && grid[i][j+1] ==1{
        dfs(grid,i,j+1,result)
    }
}
