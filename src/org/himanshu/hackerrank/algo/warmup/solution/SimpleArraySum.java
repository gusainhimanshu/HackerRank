/**
 * 
 */
package org.himanshu.hackerrank.algo.warmup.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class SimpleArraySum {

	public static void main(String[] args) {
		int sum;
		try (Scanner input = new Scanner(System.in);) {
			int size = input.nextInt();
			int arr[] = new int[size];
			for (int index = 0; index < size; index++) {
				arr[index] = input.nextInt();
			}
			sum = findSumOfElements(arr);
			System.out.println(sum);
		}
	}

	/**
	 * This will find the sum of the array
	 * 
	 * @param array
	 *            the array on which the operation will take place
	 * @return return the sum of the elements of the array
	 */
	private static int findSumOfElements(int array[]) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		return sum;

	}

}
