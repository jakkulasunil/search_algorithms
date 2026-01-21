package com.java.search.basic;

//Ceil Search
public class CeilSearchInArray {

	static int ceilSearch(int[] arr, int x) {
		if (x <= arr[0])
			return 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == x)
				return i;

			if (arr[i] < x && arr[i + 1] >= x)
				return i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 8, 10, 10, 12, 19}; 
        int x = 3; 
        int index = ceilSearch(arr, x); 
        if(index == -1) 
            System.out.println("Ceiling of " + x + " doesn't exist in array "); 
        else
            System.out.println("ceiling of " + x + " is " + arr[index]); 
	}

}
