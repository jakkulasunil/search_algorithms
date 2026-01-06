package com.java.search.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElement {

	static int kthsmallest(int[][] mat, int k) {
		int n = mat.length;

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr.add(mat[i][j]);
			}
		}
		Collections.sort(arr);

		return arr.get(k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 24, 29, 37, 48 }, { 32, 33, 39, 50 } };
		int k = 3;
//		kthsmallest(mat, k);

		System.out.println(kthsmallest(mat, k));
	}

}
