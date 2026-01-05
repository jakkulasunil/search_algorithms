package com.java.search.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KLargestElements {

	public static ArrayList<Integer> klargestElements(int[] arr, int k) {
		int n = arr.length;

		Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);

		Arrays.sort(arrInteger, Collections.reverseOrder());

		ArrayList<Integer> res = new ArrayList<>();

		for (int i = 0; i < k; i++)
			res.add(arrInteger[i]);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
		int k = 3;

		ArrayList<Integer> res = klargestElements(arr, k);
		for (int ele : res)
			System.out.print(ele + " ");
	}

}
