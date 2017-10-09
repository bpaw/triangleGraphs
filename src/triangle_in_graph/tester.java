package triangle_in_graph;

public class tester {
	
	public static boolean dfs(int[][] M, int[] visited, int i, int depth, int orig, int prev) {
		for (int j = 0; j < M.length; j++) {
        	
        	if (depth > 3) return false;
        	else if (M[i][j] == 1 && depth == 2 && visited[j] == 1 && j == orig && j != prev) {
        		return true;
        	}
        	else if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                return dfs(M, visited, j, depth + 1, orig, i);
            }
        }
        return false;
    }
    public static boolean findTriangle(int[][] M) {
        boolean result = false;
        for (int i = 0; i < M.length; i++) {
        	int[] visited = new int[M.length];
        	visited[0] = 1;
        	boolean res = dfs(M, visited, 0, 0, 0, -1);
            if (res == true) return true;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[][] hasTriangle = new int[][]{{0,1,1,0}, {1,0,1,0}, {1,1,0,1}, {0,0,1,0}};
		int[][] n2 = new int[][]{
				{0,1,0,1}, {1,0,1,0}, {0,1,0,1}, {1,0,1,0}
		};
		int[][] n3 = new int[][]{
			{0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0}
		};
		int[][] n4 = new int[][]{
			{0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}, 
			{0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}, 
			{0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}, {0,1,0,1,0,1,0,1, 0,1,0,1,0,1,0,1}, {1,0,1,0,1,0,1,0, 1,0,1,0,1,0,1,0}
		};
		System.out.println(findTriangle(hasTriangle));
		System.out.println(findTriangle(n2));
		System.out.println(findTriangle(n3));
		System.out.println(findTriangle(n4));
	}
}
