package com.mayank.matrix;

public class MatrixWave {
	static final int ARR_SIZE = 5;
	static int [][] mtrx = new int[ARR_SIZE][ARR_SIZE];
	static int [][] newmtr = new int[ARR_SIZE][ARR_SIZE];
	static int counter = 1;
	public static void main(String[] args) {
		for (int i = 0; i<ARR_SIZE; i++) {
			for (int j = 0; j<ARR_SIZE; j++) {
				mtrx[i][j] = counter++;
			}
		}
		
		for (int i = 0; i<ARR_SIZE; i++) {
			for (int j = 0; j<ARR_SIZE; j++) {
				newmtr[i][j] = mtrx[j][i];
			}
		}
		
		for (int i = 0; i<ARR_SIZE; i++) {
			for (int j = 0; j<ARR_SIZE; j++) {
				System.out.print(newmtr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n\n");
		
		
		int c = ARR_SIZE;
		boolean vertical = false;
		
		
		for (int i = 0; i<ARR_SIZE; i++) {
			c--;
			vertical = false;
			for (int j = 0; j<ARR_SIZE; j++) {
				if (vertical) {
					System.out.print(newmtr[c][j]+"\t");
					vertical = false;
				} else {
					System.out.print(newmtr[i][j]+"\t");
					vertical = true;
				}
			}
			System.out.println();
		}
		
	}

}
