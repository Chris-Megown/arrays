import java.util.Random;

public class ListOfThings {

	public static void main(String[] args) {
		Random r = new Random();
		String manyThings = "Hobo, Chicken, Smurf, Falcon, Mario";
		String[] showMe = manyThings.split(", ");
		System.out.println(showMe[r.nextInt(4)]);

	}

}
