package com.java.search.basic;

import java.util.ArrayList;

public class MissingAndRepeatingNumber {

	public static ArrayList<Integer> findTwoElement(int[] arr, int n) {
		int repeating = -1;
		int missing = -1;

		int[] freq = new int[n + 1];

		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (freq[i] == 0)
				missing = i;
			else if (freq[i] == 2)
				repeating = i;
		}
		ArrayList<Integer> res = new ArrayList<>();
		res.add(repeating);
		res.add(missing);

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr,arr.length);

        System.out.println(ans.get(0) + " " + ans.get(1));

	}

}
