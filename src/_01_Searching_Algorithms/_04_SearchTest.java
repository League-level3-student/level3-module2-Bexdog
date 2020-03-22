package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
	String[] words = {"go", "dog", "llife", "bee", "okay"};
	String value = "llife";
		assertEquals(_00_LinearSearch.linearSearch(words, value),2);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] words = {0,5,10,15,20,25,30};
		int value = 25;
			assertEquals(_01_BinarySearch.binarySearch(words, 0,6,value),5);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] words = {1,3,5,7,9,11,13,15,98};
		int value = 98;
			assertEquals(_02_InterpolationSearch.interpolationSearch(words, value),8);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] words = {6,9,14,18,200000};
		int value = 200000;
			assertEquals(_03_ExponentialSearch.exponentialSearch(words, value),4);
	}
}
