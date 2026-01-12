package com.java.search.medium;

import java.util.ArrayList;
import java.util.List;

public class ClosestKElements {

	public static int[] printClosestElements(int[] arr, int k, int x) {

		List<Integer> list = new ArrayList<>();

		for (int num : arr) {
			list.add(num);
		}

		list.sort((a, b) -> {

			int diffA = Math.abs(a - x);
			int diffB = Math.abs(b - x);

			if (diffA == diffB) {
				return b - a;
			}
			return diffA - diffB;
		});

		List<Integer> result = new ArrayList<>();

		int count = 0;

		for (int num : list) {
			if (num == x)
				continue;

			result.add(num);
			count++;

			if (count == k)
				break;
		}

		int[] closest = new int[k];
		for (int i = 0; i < k; i++) {
			closest[i] = result.get(i);
		}

		return closest;
	}

	public static void main(String[] args) {
		int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int k = 4;
        int x = 35;

        int[] closest = printClosestElements(arr, k, x);
        for (int num : closest) {
            System.out.print(num + " ");
        }

	}

}
