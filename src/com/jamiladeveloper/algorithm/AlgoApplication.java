package com.jamiladeveloper.algorithm;

import com.jamiladeveloper.algorithm.sort.InsertionSort;

public class AlgoApplication {

	
	public static void main(String[] args) {

		Integer A[] = { 5, 4, 3, 2, 1 };

		A = InsertionSort.sort(A);

		System.out.println();
		for (int i = 0; i < A.length; i++)
			
			System.out.println(A[i] + " ");

	}

}
