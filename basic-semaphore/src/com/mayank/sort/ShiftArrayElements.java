package com.mayank.sort;

public class ShiftArrayElements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		shiftElements(4, 2, arr);
	}
	
	public static void shiftElements (int from, int to, int[] arr) {
		int i = from;
		int j = to;
		int valueTobeMoved = arr[i];
		while(i >= j) {
			if (i > 0) {
				arr[i] = arr[i-1];
				i--;
			}
		}
		
		arr[j] = valueTobeMoved;
		
		System.out.println();
	
	}

}
