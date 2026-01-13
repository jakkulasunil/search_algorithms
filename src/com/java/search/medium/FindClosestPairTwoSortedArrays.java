package com.java.search.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class FindClosestPairTwoSortedArrays {
	static int findClosestIndex(int[] arr2, int target) {
		int left = 0, right = arr2.length - 1;
		int closestIndex = -1;

		int minDiff = Integer.MAX_VALUE;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			int diff = Math.abs(arr2[mid] - target);

			if (diff < minDiff) {
				minDiff = diff;
				closestIndex = mid;
			}

			if (arr2[mid] == target)
				return mid;
			else if (arr2[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return closestIndex;
	}

	static ArrayList<Integer> findClosestPair(int[] arr1, int[] arr2, int x) {
		int n = arr1.length;
//		int m = arr2.length;

		int diff = Integer.MAX_VALUE;
		ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0, 0));
		for (int i = 0; i < n; i++) {
			int target = x - arr1[i];
			
			int idx=findClosestIndex(arr2, target);
			
			if(idx!=-1 && Math.abs(arr1[i]+arr2[idx]-x)<diff) {
				diff=Math.abs(arr1[i]+arr2[idx]-x);
				result.set(0,arr1[i]);
				result.set(1, arr2[idx]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Input arrays and target sum
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 38;

        // Find the closest pair
        ArrayList<Integer> closest = findClosestPair(arr1, arr2, x);

        // Print the result
        System.out.println("[" + closest.get(0) + ", " + closest.get(1) + "]");

	}

}
