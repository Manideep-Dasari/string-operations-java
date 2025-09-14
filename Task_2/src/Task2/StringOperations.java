package Task2;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking input form the users
		System.out.print("Enter the String: ");
		String input = sc.nextLine();

		// Converting the input into lower case letters
		String str = input.toLowerCase();

		// Using Sting Builder in-built methods to reverse the input string
		String reversed = new StringBuilder(str).reverse().toString();

		// Using Loops to find the vowels and consonants
		int vowels = 0, consonants = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				if ("aeiou".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		// Checking whether the input string is palindrome or not
		boolean isPalindrome = str.equals(reversed);

		System.out.println("-----Results-----");
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversed);
		System.out.println("No of Vowels: " + vowels);
		System.out.println("No of consonants: " + consonants);
		System.out.println("Palindrome: " + (isPalindrome ? "Yes" : "No"));

	}

}
