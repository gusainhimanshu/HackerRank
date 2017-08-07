/**
 * <p>Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
 * Noon 12:00:00PM is on a 12-hour clock, and 12:00:00 on a 24-hour clock.</p>
 * <b>Input Format</b>
 * A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAm or hh:mm:ssPM ), where 01<= hh <=12 and 00<=mm,ss<=59.
 * <b>Output Format</b>
 * Convert and print the given time in 24-hour format, where 00<=hh<=23.
 * <b>Sample Input</b>
 * <i>07:05:45PM</i>
 * <b>Sample Output</b>
 * <i>19:05:45</i>
 */
package org.himanshu.hackerrank.algo.warmup.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class TimeConversion {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in);) {
			String inputTime = "";
			// String inputTime =
			// in.next("(1[0-2]|0?[1-9]):([0-5]?[0-9]):([0-5]?[0-9])(â—??[AP]M)?");
			try {
				inputTime = input.next("(1[0-2]|0?[1-9]):([0-5]?[0-9]):([0-5]?[0-9])((â—??[APap][Mm]))?");
			} catch (Exception e) {
				System.out.println("Kindly enter the pattern HH:MM:SS[AM|PM], where HH is <=12 , MM and SS <=59");

			}
			convert(inputTime);
		}
	}

	private static void convert(String inputTime) {
		String str;
		if (inputTime.endsWith("AM")) {
			str = inputTime.replace("AM", "");
			String[] timeTokens = str.split(":");
			String hr = timeTokens[0];
			if (hr.equals("12")) {
				hr = hr.replace("12", "00");
			}
			System.out.println(hr + ":" + timeTokens[1] + ":" + timeTokens[2]);
		} else if (inputTime.endsWith("PM")) {
			str = inputTime.replace("PM", "");
			String[] timeTokens = str.split(":");
			String hr = timeTokens[0];
			if (hr.equals("12")) {
				hr = hr.replace("12", "00");
			}
			int hour = Integer.parseInt(hr);
			hour += 12;
			System.out.println(hour + ":" + timeTokens[1] + ":" + timeTokens[2]);
		}
	}
}
