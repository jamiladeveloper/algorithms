package com.jamiladeveloper.algorithm.sort;

public class InsertionSort {

	private InsertionSort() {
	}

	public static Integer[] sort(Integer[] A) {

		if (A.length < 2) {
			return A;
		}

		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			while (j > 0 && A[j] > key) {

				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = A[j];
			A[j] = key;

			
		}

		return A;

	}
}
