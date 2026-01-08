package com.java.search.medium;

public class FindElement {

	static int findElements(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {

			int left = Integer.MIN_VALUE;

			for (int j = 0; j < i; j++) {
				left = Math.max(left, arr[j]);
			}

			int right = Integer.MAX_VALUE;

			for (int j = i + 1; j < arr.length; j++) {
				right = Math.min(right, arr[j]);
			}

			if (arr[i] >= left && arr[i] <= right) {
				return arr[i];
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println(findElements(arr));
	}

}
