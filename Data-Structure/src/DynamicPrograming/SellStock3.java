package DynamicPrograming;

class SellStock3
{
    // Function to find the maximum profit that can be earned by selling the stocks.
    // Here, arrays `x[0…n-1]` and `y[0…n-1]` contains the two different stocks'
    // future price predictions for the next n–days.
    public static int findMaxProfit(int[] x, int[] y)
    {
        // base case
        if (x.length == 0) {
            return 0;
        }
 
        int prev_of_prev = 0;
        int prev = Integer.max(x[0], y[0]);
 
        // Find the maximum profit in a bottom-up manner
        for (int i = 1; i < x.length; i++)
        {
            int curr = Integer.max(x[i] + prev, y[i] + prev_of_prev);
            prev_of_prev = prev;
            prev = curr;
        }
 
        // `prev` stores the maximum profit gained till day `n`
        return prev;
    }
 
    public static void main(String[] args)
    {
        int[] x = { 5, 3, 4, 6, 3 };
        int[] y = { 8, 4, 3, 5, 10 };
 
        System.out.println("The maximum profit earned is " + findMaxProfit(x, y));
    }
}