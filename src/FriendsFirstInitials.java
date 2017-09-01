import java.util.Scanner;

public class FriendsFirstInitials {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] peerNames = new String[4];
		for (int idx = 0; idx < peerNames.length; idx++) {
			System.out.println("Who is in your class?");
			peerNames[idx] = input.next();

		}
		for (int idx = 0; idx < peerNames.length; idx++) {
			System.out.println("The first letter of your name is: " +
					peerNames[idx].charAt(0));

		}

	}

}
