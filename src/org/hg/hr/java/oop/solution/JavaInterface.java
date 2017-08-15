package org.hg.hr.java.oop.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		List<Integer> factorsList = getAllFactors(n);
		return factorsList.stream().mapToInt(Integer::intValue).sum();
	}

	private List<Integer> getAllFactors(int n) {
		List<Integer> factorsList = new ArrayList<>();
		int divisor = 0;
		factorsList.add(1);
		factorsList.add(n);
		if (n % 2 == 0) {
			divisor = 2;
			factorsList.add(2);
			if (divisor != n / 2) {
				factorsList.add(n / 2);
			}
		}
		divisor = 3;
		while (divisor < n / 2) {
			if (n % divisor == 0 && !factorsList.contains(divisor)) {
				int quotient = n / divisor;
				factorsList.add(divisor);
				if (divisor != quotient) {
					factorsList.add(quotient);
				}
			}
			divisor++;
		}

		return factorsList;
	}

}

public class JavaInterface {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	static void ImplementedInterfaceNames(Object o) {
		@SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}
