package DynamicPrograming;

class CountAllPath1
{
    // Top-down recursive function to count all paths from cell (m, n)
    // to the last cell (M-1, N-1) in a given `M × N` rectangular grid
    public static int countPaths(int m, int n, int M, int N)
    {
        // there is only one way to reach the last cell
        // when we are at the last row or the last column
        if (m == M - 1 || n == N - 1) {
            return 1;
        }
 
        return countPaths(m + 1, n, M, N)     // move down
            + countPaths(m, n + 1, M, N);     // move right
    }
 
    public static void main(String[] args)
    {
        // `M × N` matrix
        int M = 3;
        int N = 3;
 
        int k = countPaths(0, 0, M, N);
        System.out.println("The total number of paths is " + k);
    }
}