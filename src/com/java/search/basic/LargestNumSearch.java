package com.java.search.basic;

public class LargestNumSearch {

	public static int findLargest(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,6,7,20};
		System.out.println(findLargest(arr));

	}

}
