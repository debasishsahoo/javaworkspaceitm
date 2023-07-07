package DynamicPrograming;

class SellStock2
{
    // Function to find the maximum earnings that can be earned by selling the stocks.
    // Here, arrays `x[0…n-1]` and `y[0…n-1]` contains the two different stocks'
    // future price predictions for the next n–days.
    public static int findMaxProfit(int[] x, int[] y)
    {
        // base case
        if (x.length == 0) {
            return 0;
        }
 
        // create an auxiliary array `T[]` to save solutions to the subproblems.
        // Here, `T[i]` stores the maximum earnings till day `i`.
        int[] T = new int[x.length + 1];
 
        // Base cases
        T[0] = 0;
        T[1] = Integer.max(x[0], y[0]);
 
        // Fill the auxiliary array `T[]` in a bottom-up manner
        for (int i = 2; i <= x.length; i++) {
            T[i] = Integer.max(x[i - 1] + T[i - 1], y[i - 1] + T[i - 2]);
        }
 
        // `T[n]` stores the maximum earnings till day `n`
        return T[x.length];
    }
 
    public static void main(String[] args)
    {
        int[] x = { 5, 3, 4, 6, 3 };
        int[] y = { 8, 4, 3, 5, 10 };
 
        System.out.println("The maximum profit earned is " + findMaxProfit(x, y));
    }
}