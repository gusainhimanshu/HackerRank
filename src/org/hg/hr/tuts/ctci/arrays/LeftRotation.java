package org.hg.hr.tuts.ctci.arrays;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			} 
			a= rotateLeft(a,k);
			for (int a_i = 0; a_i < n; a_i++) {
				System.out.print(a[a_i]+ " ");
			} 
		} finally {
			if(in != null){
				in.close();
			}
		}

	}

	private static int[] rotateLeft(int[] a, int k) {
		int temp=0;
		int size = a.length;
		while(k !=0){
			temp =a[0];
			for(int i=1; i<a.length ;i++){
				a[i-1] = a[i];
			}
			a[size-1]=temp;
			k--;
		}
		return a;
		
	}

}
