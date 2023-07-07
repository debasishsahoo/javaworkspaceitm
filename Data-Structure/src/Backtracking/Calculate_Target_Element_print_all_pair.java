package Backtracking;

import java.util.ArrayDeque;
import java.util.Deque;

class Pair {
	Integer num;
	Character sign;

	Pair(Integer num, Character sign) {
		this.num = num;
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "(" + this.sign + ")" + this.num + " ";
	}
}

public class Calculate_Target_Element_print_all_pair {
	private static void printList(Deque<Pair> list) {
		for (Pair p : list) {
			System.out.print(p);
		}
		System.out.println();
	}

	// Print all ways to calculate a target from elements of a specified array
	public static void printWays(int[] nums, int i, int target, Deque<Pair> auxlist) {
		// base case: if a target is found, print the result list.
		if (target == 0 && i == nums.length) {
			printList(auxlist);
		}

		// base case: no elements are left
		if (i == nums.length) {
			return;
		}

		// ignore the current element
		printWays(nums, i + 1, target, auxlist);

		// consider the current element and subtract it from the target
		auxlist.addLast(new Pair(nums[i], '+'));
		printWays(nums, i + 1, target + nums[i], auxlist);
		auxlist.pollLast(); // backtrack

		// consider the current element and add it to the target
		auxlist.addLast(new Pair(nums[i], '-'));
		printWays(nums, i + 1, target - nums[i], auxlist);
		auxlist.pollLast(); // backtrack
	}

	public static void main(String[] args) {
		// input array and target number
		int[] nums = { 5, 3, -6, 2 };
		int target = 6;

		printWays(nums, 0, target, new ArrayDeque<>());
	}
}
