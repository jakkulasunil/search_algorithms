package com.java.search.basic;

public class FloorSearchInArray {

	public static int floorSeach(int[] arr, int x) {

		int n = arr.length;
		if (x >= arr[n - 1])
			return n - 1;

		if (x < arr[0])
			return -1;

		int ans = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > x)
				return (i - 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
	        int x = 7;
	        int index = floorSeach(arr, x);

	        System.out.print(index);

	}

}
