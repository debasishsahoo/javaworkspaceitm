package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
 
// Data structure to store job details. Each job has an identifier,
// a deadline, and profit associated with it.
class Job
{
    public int taskId, deadline, profit;
 
    public Job(int taskId, int deadline, int profit)
    {
        this.taskId = taskId;
        this.deadline = deadline;
        this.profit = profit;
    }
}
 
class JobSchedule
{
    // Function to schedule jobs to maximize profit
    public static void scheduleJobs(List<Job> jobs, int T)
    {
        // stores the maximum profit that can be earned by scheduling jobs
        int profit = 0;
 
        // array to store used and unused slots info
        int[] slot = new int[T];
        Arrays.fill(slot, -1);
 
        // arrange the jobs in decreasing order of their profits
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
 
        // consider each job in decreasing order of their profits
        for (Job job: jobs)
        {
            // search for the next free slot and map the task to that slot
            for (int j = job.deadline - 1; j >= 0; j--)
            {
                if (j < T && slot[j] == -1)
                {
                    slot[j] = job.taskId;
                    profit += job.profit;
                    break;
                }
            }
        }
 
        // print the scheduled jobs
        System.out.println("The scheduled jobs are " +
                Arrays.stream(slot).filter(val -> val != -1).boxed()
                        .collect(Collectors.toList()));
 
        // print total profit that can be earned
        System.out.println("The total profit earned is " + profit);
    }
 
    public static void main(String[] args)
    {
        // List of given jobs. Each job has an identifier, a deadline, and
        // profit associated with it
        List<Job> jobs = Arrays.asList(
                new Job(1, 9, 15), new Job(2, 2, 2), new Job(3, 5, 18),
                new Job(4, 7, 1), new Job(5, 4, 25), new Job(6, 2, 20),
                new Job(7, 5, 8), new Job(8, 7, 10), new Job(9, 4, 12),
                new Job(10, 3, 5));
 
        // stores the maximum deadline that can be associated with a job
        final int T = 15;
 
        // schedule jobs and calculate the maximum profit
        scheduleJobs(jobs, T);
    }
}