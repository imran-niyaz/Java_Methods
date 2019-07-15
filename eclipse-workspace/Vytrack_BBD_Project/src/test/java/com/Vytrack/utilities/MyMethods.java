package com.Vytrack.utilities;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMethods {
	
	public static void main(String[] args) {
		
		int[] nums = {12,34,56,78,90,12,42,3};
		MyMethods.FindBigNum(nums);
		MyMethods.FindSmallestNum(nums);
		
		String[] strArr = {"alma","neshput","neshput","alma","uzum","alma"};
		MyMethods.printUniqueElements(strArr);
		MyMethods.plus(12, 23);
		MyMethods.plus(12, 12, 32);
		MyMethods.plus(23, 54);
		
		
	}
	


	//Void type reverse method
	public static void ReverseString(String word) {

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
	
	
	//return type reverse method
	public static String ReverseString1(String word) {

		String store = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			store += word.charAt(i);
		}
		return store;
	}
	
	/*
	 * Create a method that
	 *   finds the biggest number inside int array
	 * 
	 */
	
	public static void FindBigNum(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > temp) {
				temp = nums[i];
			}
		}
		System.out.println("The Biggest Number: " + temp);
	}
	
	public static void FindSmallestNum(int[] nums) {
		int temp = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < temp) {
				temp = nums[i];
			}
		}
		System.out.println("The Smallest Number: " + temp);
	}
	
	
	public static void printUniqueElements(String[] strArr) {

		List <String>  str = new ArrayList <String> (Arrays.asList(strArr));
		Set <String>   strSet = new HashSet<String>(str); 
		System.out.println(strSet.toString());
	}
	
	
	public static void plus(int num1 , int num2) {
		
		int result = num1 + num2;
		System.out.println(result);
	}
	
   public static void plus(int num1 , int num2, int num3) {
		
		int result = num1 + num2 + num3 ;
		System.out.println(result);
	}
	
	
	
	

}
