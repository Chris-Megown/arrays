import java.util.Scanner;

public class WordPlusLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] wordLetter = new String[2];
		for (int idx = 0; idx < wordLetter.length; idx++) {
			System.out.println("Please enter a word or letter: ");
			wordLetter[idx] = input.next();

		}
		if (wordLetter[0].contains(wordLetter[1]) || wordLetter[1].contains(wordLetter[0])) {
			System.out.println("Yep, it's got one of those!");
		} else {
			System.out.println("So, sorry...");
		}

	}

}
