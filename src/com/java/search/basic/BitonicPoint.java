package com.java.search.basic;

public class BitonicPoint {

	static int findMaximum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else
				break;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 7, 8, 3}; 
        System.out.println(findMaximum(arr));
	}
}
