package com.mayank.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 23, 42, 4, 16, 8, 15 };
		
		for (int i = 0; i<arr.length; i++) {
			
			int min = i;
			for (int j = i+1; j<arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
