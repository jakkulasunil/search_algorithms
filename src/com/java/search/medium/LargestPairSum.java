package com.java.search.medium;

import java.util.Arrays;
import java.util.List;

public class LargestPairSum {

	static int findLargestSumPair(List<Integer> arr) {

		int maxSum = Integer.MIN_VALUE;
		int n = arr.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr.get(i) + arr.get(j);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return (maxSum == Integer.MIN_VALUE) ? -1 : maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(12, 34, 10, 6, 40);
        System.out.println("Max Pair Sum is " + findLargestSumPair(arr));
	}

}
