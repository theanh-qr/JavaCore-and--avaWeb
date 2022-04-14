package javacorn;

import java.util.Arrays;
import java.util.Scanner;

public class hangMan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words[] = { "program", "water", "human", "ability", "application" };
		for (int i = 0; i < words.length; i++) {
			String keyword = words[i];
			String mysteriousWord = words[i].replaceAll("[a-z]", "*");
			boolean isFinished = false;
			while (!isFinished) {
				System.out.print("Enter a letter in word " + mysteriousWord);
				String guess = input.next();
				while (guess.length() != 1) {
					System.err.print("Please enter only a letter a-z: ");
					guess = input.next();
				}
				if (keyword.contains(guess)) {
					mysteriousWord = replaceCharToStar(mysteriousWord, keyword, guess);
				} else {
					System.out.print(guess + " not in the word!");
				}
				if (mysteriousWord.compareTo(keyword) == 0) {
					System.out.print("The word is " + keyword + "\n");
					System.out.print("Do you want to guess another word? Enter y to continue: ");
					String isContinue = input.next();
					if (isContinue != "y") {
						System.exit(0);
					}
					isFinished = true;
				}
			}

		}
		System.out.println("Run out of words");
	}

	/**
	 * 
	 * @param starStr
	 * @param keyword
	 * @param guessStr
	 * @return
	 */
	private static String replaceCharToStar(String starStr, String keyword, String guessStr) {
		int indexOfGuessChar = keyword.indexOf(guessStr, 0);
		char starCharArr[] = starStr.toCharArray();
		starCharArr[indexOfGuessChar] = guessStr.charAt(0);
		return String.valueOf(starCharArr);
	}
}
