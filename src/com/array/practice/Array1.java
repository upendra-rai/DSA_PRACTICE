package com.array.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Two Sum Question From LeetCode

public class Array1 {
	public static void main(String[] args) {

		int[] numbers = { 3, 4, 2, 7, 11, 15 };
		int[] result = twoSum1(numbers, 9);
		for (int data : result) {
			System.out.println(data);
		}

	}

	// Solution No.01
	public static int[] twoSum1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return nums;

	}

	// Solution No.02
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer test=result.get(nums[i]);
		}
		return nums;

	}
}
