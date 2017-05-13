package org.himanshu.hackerrank.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class DiagonalDifference {

	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in);) {
			int size = input.nextInt();
			int array[][] = new int[size][size];
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					array[i][j] = input.nextInt();
				}
			}
			result(array, size);
		}
	}

	public static void result(int array[][], int size) {
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		int difference;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					primaryDiagonalSum += array[i][j];
				}
				if ((size - 1) == (i + j)) {
					secondaryDiagonalSum += array[i][j];
				}
			}
		}
		difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
		System.out.println(difference);

	}
}
