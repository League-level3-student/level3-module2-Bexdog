package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
static boolean intArraySorted(int[] input) {
	boolean inOrder = false;
	for(int i = 0; i<input.length-1;i++) {
		System.out.println(input[i] + " " + input[i+1]);
		if(input[i]<=input[i+1]) {
			inOrder = true;
		}
		else {
			
			return false;
		}
	}
	return inOrder;
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted(double[] input) {
	boolean inOrder = false;
	for(int i = 0; i<input.length-1;i++) {
		if(input[i]<=input[i+1]) {
			inOrder = true;
		}
		else {
			return false;
		}
	}
	
	return inOrder;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted(char[] input) {
	boolean inOrder = false;
	for(int i = 0; i<input.length-1;i++) {
		if(input[i]<=input[i+1]) {
			inOrder = true;
		}
		else {
			return false;
		}
	}
	return inOrder;
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static boolean stringArraySorted (String[] input) {
	boolean inOrder = false;
	for(int i = 0; i<input.length-1;i++) {
		if(input[i].compareTo(input[i+1])<0) {
			inOrder = true;
		}
		else {
			return false;
		}
	}
	return inOrder;
}
}
