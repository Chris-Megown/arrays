import java.util.Random;
import java.util.Scanner;

public class FindNumberInArray {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		int[] findingNum = new int[10];
		System.out.print("Array: ");

		for (int idx = 0; idx < findingNum.length; idx++) {
			System.out.print((int) (Math.random() * 50 + 1) + " ");

		}
		System.out.print("\nValue to find: ");
		int valueToFind = input.nextInt();
		for (int idx=0; idx<findingNum.length; idx++) {
			if (valueToFind == (findingNum[idx])) {
				System.out.println(valueToFind + " is in the array...Hooray!");

			}
		}


	}

}
