package Backtracking;

public class Maze_Unique_Paths {
	// Check if cell (x, y) is valid or not
	private static boolean isValidCell(int x, int y, int N) {
		return !(x < 0 || y < 0 || x >= N || y >= N);
	}

	private static int countPaths(int[][] maze, int i, int j, int x, int y, boolean visited[][]) {
		// if destination (x, y) is found, return 1
		if (i == x && j == y) {
			return 1;
		}

		// stores number of unique paths from source to destination
		int count = 0;

		// mark the current cell as visited
		visited[i][j] = true;

		// `N × N` matrix
		int N = maze.length;

		// if the current cell is a valid and open cell
		if (isValidCell(i, j, N) && maze[i][j] == 1) {
			// go down (i, j) ——> (i + 1, j)
			if (i + 1 < N && !visited[i + 1][j]) {
				count += countPaths(maze, i + 1, j, x, y, visited);
			}

			// go up (i, j) ——> (i - 1, j)
			if (i - 1 >= 0 && !visited[i - 1][j]) {
				count += countPaths(maze, i - 1, j, x, y, visited);
			}

			// go right (i, j) ——> (i, j + 1)
			if (j + 1 < N && !visited[i][j + 1]) {
				count += countPaths(maze, i, j + 1, x, y, visited);
			}

			// go left (i, j) ——> (i, j - 1)
			if (j - 1 >= 0 && !visited[i][j - 1]) {
				count += countPaths(maze, i, j - 1, x, y, visited);
			}
		}

		// backtrack from the current cell and remove it from the current path
		visited[i][j] = false;

		return count;
	}

	public static int findCount(int[][] maze, int i, int j, int x, int y) {
		// base case: invalid input
		if (maze == null || maze.length == 0 || maze[i][j] == 0 || maze[x][y] == 0) {
			return 0;
		}

		// `N × N` matrix
		int N = maze.length;

		// 2D matrix to keep track of cells involved in the current path
		boolean[][] visited = new boolean[N][N];

		// start from source cell (i, j)
		return countPaths(maze, i, j, x, y, visited);
	}

	public static void main(String[] args) {
		int[][] maze = { 
				{ 1, 1, 1, 1 },
				{ 1, 1, 0, 1 }, 
				{ 0, 1, 0, 1 }, 
				{ 1, 1, 1, 1 } };

		// source cell (0, 0), destination cell (3, 3)
		int count = findCount(maze, 0, 0, 3, 3);

		System.out.println("The total number of unique paths are " + count);
	}
}
