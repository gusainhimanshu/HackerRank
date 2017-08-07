/**
 * 
 */
package org.hg.hr.algo.warmup.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class CircularArrayRotation {
	private CircularArrayRotation() {

	}

	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in);) {
			int index = 0;
			int size = input.nextInt();
			int numberOfTimes = input.nextInt();
			int querySize = input.nextInt();

			int arrayofIntegers[] = new int[size];
			int queryArray[] = new int[querySize];
			/**
			 * to make sure that rotation is in circular manner.The mod(%)
			 * operator returns the remainder so if rotation(i.e. numberOfTimes)
			 * is greater than size, due to the mod(%) operator the value of
			 * numberOfTimes will be remainder of numberOfTimes/size. e.x. if
			 * numberOfTimes=9, size=6 than numberOfTimes=3 after this operation
			 * and if k is multiple of n i.e. if numberOfTimes=5,10,15,20.....
			 * and size=5 than numberOfTimes=0 after the operation.
			 */
			numberOfTimes = numberOfTimes % size;

			for (index = 0; index < arrayofIntegers.length; index++) {
				arrayofIntegers[index] = input.nextInt();
			}
			for (index = 0; index < querySize; index++) {
				queryArray[index] = input.nextInt();
				int finalIndex = (queryArray[index] - numberOfTimes);
				/**the case when number of times is greater than queryArray[index]*/
				if (finalIndex < 0) {
					/** this is nothing but size + queryArray[index] - numberOfTimes */
					System.out.println(arrayofIntegers[size + finalIndex]);
				} else {
					System.out.println(arrayofIntegers[finalIndex]);
				}
			}

		}
	}
}
