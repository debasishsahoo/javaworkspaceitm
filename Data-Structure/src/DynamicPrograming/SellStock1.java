package DynamicPrograming;

class SellStock1
{
    // Recursive function to find the maximum profit that can be earned by selling
    // stocks. Here, arrays `x[0…n]` and `y[0…n]` contains the two different stocks'
    // future price predictions for the next n–days.
    public static int findMaxProfit(int[] x, int[] y, int n)
    {
        // base case
        if (n < 0) {
            return 0;
        }
 
        // store the maximum profit gained
        int profit = 0;
 
        // sell the first stock on the n'th day, and recur for the (n-1)'th day
        profit = Integer.max(profit, x[n] + findMaxProfit(x, y, n - 1));
 
        // sell the second stock on the n'th day, and recur for the (n-2)'th day
        // (no transaction can be made on the (n-1)'th day)
        profit = Integer.max(profit, y[n] + findMaxProfit(x, y, n - 2));
 
        // return the maximum profit
        return profit;
    }
 
    public static void main(String[] args)
    {
        int[] x = { 5, 3, 4, 6, 3 };
        int[] y = { 8, 4, 3, 5, 10 };
 
        System.out.println("The maximum profit earned is " +
                findMaxProfit(x, y, x.length - 1));
    }
}