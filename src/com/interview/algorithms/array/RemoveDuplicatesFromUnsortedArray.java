package com.interview.algorithms.array;

public class RemoveDuplicatesFromUnsortedArray {

	public static void removeDuplicates() {
		int[] a = new int[] { 2, 2, 4, 4, 5, 5 };

		for (int j = 0; j < a.length; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (a[j] == a[i]) {
					a[i] = -1;
				}
			}

			
		}
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+",");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		removeDuplicates();
	}

}