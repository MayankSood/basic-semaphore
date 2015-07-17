package com.mayank.sort;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5, 100, 101 };
		int[] a2 = { 2, 11, 12, 13, 14, 15, 16, 102 };
		int[] finalArray = new int[a1.length + a2.length];

		int c = 0;
		int c1 = 0;
		int c2 = 0;
		while (c1 <= a1.length - 1 && c2 <= a2.length - 1) {
			if (a1[c1] < a2[c2]) {
				finalArray[c++] = a1[c1++];
			} else if (a1[c1] > a2[c2]) {
				finalArray[c++] = a2[c2++];
			} else {
				finalArray[c++] = a1[c1++];
				finalArray[c++] = a2[c2++];
			}
		}

		if (c1 == a1.length) {
			for (int i = c2; i < a2.length; i++) {
				finalArray[c++] = a2[i];
			}
		} else {
			for (int i = c1; i < a1.length; i++) {
				finalArray[c++] = a1[i];
			}
		}

		for (int f : finalArray) {
			System.out.print(f + " ");
		}

	}

}
