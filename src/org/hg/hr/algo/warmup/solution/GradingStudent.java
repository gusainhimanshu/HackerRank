package org.hg.hr.algo.warmup.solution;

import java.util.Scanner;

public class GradingStudent {

	static int[] solve(int[] grades) {
		for (int grades_i = 0; grades_i < grades.length; grades_i++) {
			if (grades[grades_i] > 37) {
				int num = roundUp(grades[grades_i]);
				if ((num - grades[grades_i]) < 3) {
					grades[grades_i] = num;
				}
			}
		}
		return grades;
	}

	static int roundUp(int n) {
		return (n + 4) / 5 * 5;
	}

	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			int n = in.nextInt();
			int[] grades = new int[n];
			for (int grades_i = 0; grades_i < n; grades_i++) {
				grades[grades_i] = in.nextInt();
			}
			int[] result = solve(grades);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
			}
			System.out.println("");
		} catch (Exception e) {
			if (in != null) {
				in.close();
			}
			e.printStackTrace();
		}

	}

}
