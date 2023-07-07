package Greedy;

import java.util.Arrays;

class Plateform
{
    // Function to find the minimum number of platforms needed
    // to avoid delay in any train arrival
    public static int findMinPlatforms(double[] arrival, double[] departure)
    {
        // sort arrival time of trains
        Arrays.sort(arrival);
 
        // sort departure time of trains
        Arrays.sort(departure);
 
        // maintains the count of trains
        int count = 0;
 
        // stores minimum platforms needed
        int platforms = 0;
 
        // take two indices for arrival and departure time
        int i = 0, j = 0;
 
        // run till all trains have arrived
        while (i < arrival.length)
        {
            // if a train is scheduled to arrive next
            if (arrival[i] < departure[j])
            {
                // increase the count of trains and update minimum
                // platforms if required
                platforms = Integer.max(platforms, ++count);
 
                // move the pointer to the next arrival
                i++;
            }
 
            // if the train is scheduled to depart next i.e.
            // `departure[j] < arrival[i]`, decrease trains' count
            // and move pointer `j` to the next departure.
 
            // If two trains are arriving and departing simultaneously,
            // i.e., `arrival[i] == departure[j]`, depart the train first
            else {
                count--;
                j++;
            }
        }
 
        return platforms;
    }
 
    public static void main(String[] args)
    {
        double[] arrival = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
        double[] departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 };
 
        System.out.print("The minimum platforms needed is "
                    + findMinPlatforms(arrival, departure));
    }
}