package Backtracking;
import java.util.Stack;
public class ShortestRoutes {
	// Recursive function to get all routes in a rectangular grid
	// that start at cell (i, j) and ends at the last cell (M-1, N-1).
	public static void printPaths(int[][] mat, Stack<Integer> route, int i, int j) {
		// base case
		if (mat == null || mat.length == 0) {
			return;
		}

		int M = mat.length;
		int N = mat[0].length;

		// include current cell in route
		route.add(mat[i][j]);

		// if the last cell is reached
		if (i == M - 1 && j == N - 1) {
			System.out.println(route);
		} else {
			// move down
			if (i + 1 < M) {
				printPaths(mat, route, i + 1, j);
			}

			// move right
			if (j + 1 < N) {
				printPaths(mat, route, i, j + 1);
			}

			// move diagonally
			if (i + 1 < M && j + 1 < N) {
				printPaths(mat, route, i + 1, j + 1);
			}
		}

		// backtrack: remove the current cell from the route
		route.pop();
	}

	// Print all routes in a rectangular grid
	public static void printPaths(int[][] mat) {
		// list to store the current route
		Stack<Integer> route = new Stack<>();

		// start from the first cell (0, 0)
		printPaths(mat, route, 0, 0);
	}

	public static void main(String[] args) {
		int[][] mat = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };

		printPaths(mat);
	}
}
