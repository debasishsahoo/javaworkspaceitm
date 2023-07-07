package DynamicPrograming;

class CountAllPath2
{
    // Bottom-up function to count all paths from the first cell (0, 0)
    // to the last cell (M-1, N-1) in a given `M × N` rectangular grid
    public static int countPaths(int m, int n)
    {
        // `T[i][j]` stores the number of paths from cell (0, 0) to cell (i, j)
        int[][] T = new int[m][n];
 
        // There is only one way to reach any cell in the first column, i.e.,
        // to move down
        for (int i = 0; i < m; i++) {
            T[i][0] = 1;
        }
 
        // There is only one way to reach any cell in the first row, i.e.,
        // to move right
        for (int j = 0; j < n; j++) {
            T[0][j] = 1;
        }
 
        // fill `T[][]` in a bottom-up manner
        for (int i = 1; i < m; i++)
        {
            for (int j = 1; j < n; j++) {
                T[i][j] = T[i-1][j] + T[i][j-1];
            }
        }
 
        // last cell of `T[][]` stores the count of paths from cell (0, 0) to
        // cell (i, j)
        return T[m-1][n-1];
    }
 
    public static void main(String[] args)
    {
        // `M × N` matrix
        int M = 3;
        int N = 3;
 
        int k = countPaths(M, N);
        System.out.println("The total number of paths is " + k);
    }
}