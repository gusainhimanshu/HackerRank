package org.hg.hr.algo.strings.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class SuperReducedString {

	static String super_reduced_string(String s) {
		int index = 0;
		while (index < (s.length() - 1)) {
			if (s.charAt(index) == s.charAt(index + 1)) {
				s = String.join("", s.substring(0, index), s.substring(index + 2, s.length()));
				index = 0;
			} else {
				index++;
			}
		}
		if (s.isEmpty()) {
			return "Empty String";
		} else {
			return s;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			String s = in.next();
			String result = super_reduced_string(s);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}

		}
	}

}
