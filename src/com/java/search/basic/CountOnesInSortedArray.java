package com.java.search.basic;

import java.util.Arrays;
import java.util.List;

public class CountOnesInSortedArray {

	static int countOnes(List<Integer> arr) {
		int count = 0;
		for (int num : arr) {
			if (num == 1)
				count++;
			else
				break;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> arr = Arrays.asList(1, 1, 1, 1, 0, 0, 0);
	        System.out.println(countOnes(arr));
	}

}
