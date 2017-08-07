package org.himanshu.hackerrank.algo.warmup.solution;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			int size = input.nextInt();
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if ((size - 1) <= (i + j)) {
						System.out.print("#");
					} else if ((size - 1) > (i + j)) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
