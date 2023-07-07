package Backtracking;

public class Calculate_Taget_Element {
	// Count ways to calculate a target from elements of a specified array
	public static int countWays(int[] nums, int i, int target) {
		// base case: if a target is found
		if (target == 0 && i == nums.length) {
			return 1;
		}

		// base case: no elements are left
		if (i == nums.length) {
			return 0;
		}

		// 1. ignore the current element
		int exclude = countWays(nums, i + 1, target);

		// 2. Consider the current element

		// 2.1. Subtract the current element from the target
		// 2.2. Add the current element to the target
		int include = countWays(nums, i + 1, target - nums[i]) + countWays(nums, i + 1, target + nums[i]);

		// Return total count
		return exclude + include;
	}

	public static void main(String[] args) {
		// input array and target number
		int[] nums = { 5, 3, -6, 2 };
		int target = 6;

		System.out.println(countWays(nums, 0, target) + " ways");
	}
}
