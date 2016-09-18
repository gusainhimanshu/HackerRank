/**
 * 
 */
package org.himanshu.hackerrank.solution;

import java.util.Scanner;

/**
 * @author Himanshu Gusain
 *
 */
public class SimpleArraySum {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int index = 0; index < size ;index++){
        	arr[index] = in.nextInt();
        }
        sum = findSumOfElements(arr);
        System.out.println(sum);
    }
    private static int findSumOfElements(int array[]){
        int sum=0;
        for(int index = 0; index<array.length; index++){
            sum += array[index];
        }
        return sum;
    }
	
}
