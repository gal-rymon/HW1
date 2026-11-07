public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] visited = new int[m[0].length];
        visited[i] = 1;
        return helper(m,i,j,visited);
    }
        
    private static int helper(int[][] m, int i, int j, int[] visited){
        if (i==j){return 0;}
        if (m[i][j] == 1){return 1;}
        
        int min_path = Integer.MAX_VALUE;
        for (int k=0; k<m[i].length; k++){
            if (m[i][k] == 1 && visited[k] == 0){
                visited[k] = 1;
                int curr_path = 1 + helper(m, k, j, visited);
                if (curr_path<min_path && curr_path!=0){
                    min_path = curr_path;
                }
                visited[k] = 0;
            }
        }
        if (min_path <= m[0].length){return min_path;}
        else{return -1;}
        }
        
    

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}