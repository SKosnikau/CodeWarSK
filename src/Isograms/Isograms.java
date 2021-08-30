package Isograms;

import java.util.Arrays;

public class Isograms {
	public static void main(String[] args) {

//		An isogram is a word that has no repeating letters, consecutive or non-consecutive.
//		Implement a function that determines whether a string that contains only letters is an isogram.
		System.out.println(isIsogram("meal"));
		System.out.println(isIsogram("week"));
		System.out.println(isIsogram("Aa"));
		System.out.println(isIsogram("Dermatoglyphics"));

	}

	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
		int length = str.length();
		char array[] = str.toCharArray();

		Arrays.sort(array);
		for (int i = 0; i < length - 1; i++) {
			if (array[i] == array[i + 1])
				return false;
		}
		return true;
	}
}