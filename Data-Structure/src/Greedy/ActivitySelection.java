package Greedy;

import java.util.*;
import java.util.stream.Collectors;
 
// A simple pair class to store the start and finish time
// of the activities
class Pair
{
    private int start, finish;
 
    public Pair(int start, int finish)
    {
        this.start = start;
        this.finish = finish;
    }
 
    public int getFinish() {
        return finish;
    }
 
    public int getStart() {
        return start;
    }
 
    @Override
    public String toString() {
        return "(" + getStart() + ", " + getFinish() + ")";
    }
}
 
class ActivitySelection
{
    // Activity selection problem
    public static List<Pair> selectActivity(List<Pair> activities)
    {
        // `k` keeps track of the index of the last selected activity
        int k = 0;
 
        // set to store the selected activities index
        Set<Integer> result = new HashSet<>();
 
        // select 0 as the first activity
        if (activities.size() > 0) {
            result.add(0);
        }
 
        // sort the activities according to their finishing time
        Collections.sort(activities, Comparator.comparingInt(Pair::getFinish));
 
        // start iterating from the second element of the
        // list up to its last element
        for (int i = 1; i < activities.size(); i++)
        {
            // if the start time of the i'th activity is greater or equal
            // to the finish time of the last selected activity, it
            // can be included in the activities list
 
            if (activities.get(i).getStart() >= activities.get(k).getFinish())
            {
                result.add(i);
                k = i;            // update `i` as the last selected activity
            }
        }
 
        return result.stream()
                .map(activities::get)
                .collect(Collectors.toList());
    }
 
    public static void main(String[] args)
    {
        // List of given jobs. Each job has an identifier, a deadline, and a
        // profit associated with it
        List<Pair> activities = Arrays.asList(new Pair(1, 4), new Pair(3, 5),
                new Pair(0, 6), new Pair(5, 7), new Pair(3, 8),
                new Pair(5, 9), new Pair(6, 10), new Pair(8, 11),
                new Pair(8, 12), new Pair(2, 13), new Pair(12, 14));
 
        List<Pair> result = selectActivity(activities);
        System.out.println(result);
    }
}

