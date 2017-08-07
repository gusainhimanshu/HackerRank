/**
 * 
 */
package org.hg.hr.algo.warmup.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class PlusMinus {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			int size = input.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = input.nextInt();
			}
			result(arr);
		}
	}

	public static void result(int arr[]) {
		double zeroCount = 0;
		double positiveCount = 0;
		double negativeCount = 0;
		double zeroFraction;
		double positiveFraction = 0;
		double negativeFraction = 0;
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (0 == arr[i]) {
				zeroCount += 1;
				continue;
			}
			if (arr[i] > 0) {
				positiveCount += 1;
				continue;
			}
			if (arr[i] < 0) {
				negativeCount += 1;
				continue;
			}
		}
		positiveFraction = positiveCount / size;

		zeroFraction = zeroCount / size;

		negativeFraction = negativeCount / size;
		System.out.println(positiveFraction + "\n" + negativeFraction + "\n" + zeroFraction);
	}
}
