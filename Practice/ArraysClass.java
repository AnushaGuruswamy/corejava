package com.Anusha.Practice;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		int []num1 = {10,20,30,40,50,60,0,80,90,100};
		int []num2 = {10,20,30,40,50};
		
		
		//binary search from array
		System.out.println("index of 40= "+Arrays.binarySearch(num1,40)); //gets the index of the specified value
		
		//comparing two arrays
		System.out.println("number of similar elements ="+Arrays.compare(num1, num2)); //gets the number of indexes which are similar in both arrays
		
		//checking whether two arrays are equal
		System.out.println("are both arays equal = "+Arrays.equals(num1, num2)); //returns true or false
		
		//getting hashCode 
		System.out.println(Arrays.hashCode(num1));
		
		//gets the index of the first non similar element 
		System.out.println(Arrays.mismatch(num1, num2));
		
		//prints the values of array in []
		System.out.println(Arrays.toString(num1));
		
		//
		int newArray[] = Arrays.copyOf(num2, 9);
		System.out.println(newArray);
		
		System.out.println(Arrays.copyOfRange(num2, 5, 8));
		
		System.out.println(Arrays.spliterator(num1));
		
		//System.out.println(Arrays.fill(num2, 10));
		
		//System.out.println(Arrays.fill(num1, 3, 6, 25));
		
		//System.out.println(Arrays.parallelPrefix(num2,op));
		
		//System.out.println(Arrays.parallelSort(num1));
		
		//System.out.println(Arrays.sort(num1));
		
		
	}

}
