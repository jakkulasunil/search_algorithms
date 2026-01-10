package com.java.search.medium;

public class FindPeakElement {

	static int peakElement(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean left = true;
			boolean right = true;

			if (i > 0 && arr[i] <= arr[i - 1])
				left = false;
			if (i < n - 1 && arr[i] <= arr[i + 1])
				right = false;

			if (left && right)
				return i;
		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 4, 5, 7, 8, 3};
	        System.out.println(peakElement(arr));
	}

}
