
public class GradePointAverage {

	public static void main(String[] args) {
		String[] studentNames = new String[5];
		studentNames[0] = "Jim";
		studentNames[1] = "Billy";
		studentNames[2] = "Dave";
		studentNames[3] = "Kyle";
		studentNames[4] = "James";
		String[] pointAvg = new String[5];
		pointAvg[0] = "0.0";
		pointAvg[1] = "1.0";
		pointAvg[2] = "2.0";
		pointAvg[3] = "3.0";
		pointAvg[4] = "4.0";

		for (int idx = 0; idx < studentNames.length; idx++) {
			System.out.println(studentNames[idx] + ": " + pointAvg[idx]);
		}

	}

}
