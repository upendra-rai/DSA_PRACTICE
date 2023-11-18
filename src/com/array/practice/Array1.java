package com.array.practice;

//Two Sum Question From LeetCode

public class Array1 {
	public static void main(String[] args) {

		int[] numbers = { 3, 4, 2, 7, 11, 15 };
		int[] result = twoSum(numbers, 9);
		for (int data : result) {
			System.out.println(data);
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return nums;

	}
}
