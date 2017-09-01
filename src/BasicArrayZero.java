import java.util.Random;

public class BasicArrayZero {

	public static void main(String[] args) {
		Random rand = new Random();

		String[] manyNumbers = new String[1000];

		for (int idx = 0; idx < manyNumbers.length; idx++) {

			System.out.print(10 + rand.nextInt((99 - 10) + 1) + "  ");

		}

	}
}
