package DynamicPrograming;

class CountAllPath3
{
    // Bottom-up space-efficient function to count all paths from the first
    // cell (0, 0) to the last cell (M-1, N-1) in a given `M × N` rectangular grid
    public static int countPaths(int m, int n)
    {
        int[] T = new int[n];
        T[0] = 1;
 
        // fill `T[][]` in a bottom-up manner
        for (int i = 0; i < m; i++)
        {
            for (int j = 1; j < n; j++) {
                T[j] += T[j - 1];
            }
        }
 
        // return the last cell
        return T[n-1];
    }
 
    public static void main(String[] args)
    {
        // `M × N` matrix
        int M = 3;
        int N = 3;
 
        int k = countPaths(M, N);
        System.out.print("The total number of paths is " + k);
    }
}
