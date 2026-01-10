package com.java.search.medium;

public class FindFixedPoint {
	static int fixedPoint(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -10, -5, 0, 3, 7 };
        System.out.println(fixedPoint(arr));
	}

}
